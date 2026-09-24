package com.facebook.ads.redexgen.core;

import java.util.Random;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7V */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C47547V {
    public static String[] A04 = {"IlrXm3tezuWbVMaXPLi828ioISQJgCfS", "NAwIzBHR00ZPv9WHAooSWGmMQnQsAYk8", "eu5lMmt7ol9PqHL84pZymZquGRu6o", "m2SAqTjU3gSqVMchVgPXeZMw5JHzzeRQ", "AbCmeSj5KlQ54JssPMwwYJBwucQ6C", "RqAiTasO9D9HsUdBZKTQCzdghtQ9E0yV", "WIBemWRSgRuyaEIJ1sL2dCgMu2IibJ9f", "z026p7uIfXqhY1JlsQjMBKUP7isQ63Up"};
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ C47557W A03;

    public C47547V(C47557W c47557w, int i, int i2, int i3) {
        this.A03 = c47557w;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final int A00() {
        Random random = new Random();
        if (random.nextInt(this.A02) == 0) {
            if (this.A01 <= 0) {
                return this.A00;
            }
            int iNextInt = random.nextInt() % this.A01;
            int i = this.A00;
            String[] strArr = A04;
            String str = strArr[4];
            String str2 = strArr[2];
            int variation = str.length();
            if (variation != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "t99WXaELTOA6CPYhlrJz9JZjCbRHN";
            strArr2[2] = "SwFbG7SpSQOHKIZQBIcFbwrWU2Enz";
            return i + iNextInt;
        }
        return 0;
    }
}
