package com.applovin.sdk;

/* JADX INFO: loaded from: classes9.dex */
public interface AppLovinCmpError {

    /* JADX INFO: loaded from: classes3.dex */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* JADX INFO: renamed from: a */
        private final int f4210a;

        Code(int i) {
            this.f4210a = i;
        }

        public int getValue() {
            return this.f4210a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
