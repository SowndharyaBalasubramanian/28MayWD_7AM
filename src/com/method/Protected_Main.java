package com.method;

import com.childpkg.Protected_Child;

public class Protected_Main {
    public static void main(String[] args){
        Protected_Child c = new Protected_Child();
        c.child();
    }
}
