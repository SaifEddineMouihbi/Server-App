package com.server.serverapp.Enumeration;

public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String Status;

    Status(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }
}
