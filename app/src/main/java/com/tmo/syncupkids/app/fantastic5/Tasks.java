package com.tmo.syncupkids.app.fantastic5;

public class Tasks {
    private String name;
    private int id;
    private boolean completed;
    private int taskValue;

    public Tasks(String ourName, int ourId, boolean ourComplete, int ourTaskValue) {
        name = ourName;
        id = ourId;
        completed = ourComplete;
        taskValue = ourTaskValue;
    }

    protected String getName() {
        return name;
    }

    protected void setCompletion() {
        completed = true;
    }

    protected int getTaskValue() {
        return taskValue;
    }

    protected boolean getCompletion() {
        return completed;
    }
}
