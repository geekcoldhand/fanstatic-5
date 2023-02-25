package com.tmo.syncupkids.app.fantastic5

import android.content.ContentResolver
import android.database.ContentObserver
import android.net.Uri

/**
 * Copyright (c) 2023 T-Mobile USA, Inc.
 *
 * This is not approved for commercial use. It's untested and for use only during the hackathon
 * event at Curiosity Labs Feb 24-26, 2023
 */

object LocationUtils {

    fun fetchNewLocation(cr: ContentResolver): Boolean {
        val uri = Uri.parse("content://com.quanta.syncupkids.watch.contentprovider")
        val bundle = cr.call(uri, "fetchNewLocation", null, null)
        return bundle?.getBoolean("fetchLocationResponse") ?: false
    }

    fun registerForLocationUpdates(cr: ContentResolver, co: ContentObserver) {
        val uri = Uri.parse("content://com.quanta.syncupkids.watch.contentprovider/location")
        cr.registerContentObserver(uri, true, co)
    }

    fun getLatestLocation(cr: ContentResolver): LatLong {
        val uri = Uri.parse("content://com.quanta.syncupkids.watch.contentprovider")
        val bundle = cr.call(uri, "getTheNewLocation", null, null)
        val lat = bundle?.getString("locationLat") ?: "0"
        val long = bundle?.getString("locationLong") ?: "0"
        return LatLong(lat, long)
    }

    class LatLong(val lat: String, val long: String) {
        override fun toString(): String {
            return "Lat: $lat, Long: $long"
        }
    }
}