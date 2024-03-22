package org.example.controller;

import org.example.dto.Member;

public abstract class Controller {
    public static Member loginedMember;
    public static boolean isLongined() {
        return loginedMember != null;
    }
    public abstract void doAction(String cmd, String actionMethodName);
    public abstract void makeTestData();
}