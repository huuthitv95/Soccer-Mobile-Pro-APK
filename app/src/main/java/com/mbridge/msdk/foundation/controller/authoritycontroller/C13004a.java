package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.a */
/* JADX INFO: compiled from: BaseAuthorityInfoBean.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13004a {

    /* JADX INFO: renamed from: a */
    protected int f35498a;

    /* JADX INFO: renamed from: b */
    protected int f35499b;

    /* JADX INFO: renamed from: c */
    protected int f35500c;

    /* JADX INFO: renamed from: d */
    protected int f35501d;

    /* JADX INFO: renamed from: a */
    protected void m36554a(int i) {
        this.f35498a = i;
        this.f35499b = i;
        this.f35500c = i;
    }

    public void authDeviceIdStatus(int i) {
        this.f35499b = i;
    }

    public void authGenDataStatus(int i) {
        this.f35498a = i;
    }

    public void authOtherDataStatus(int i) {
        this.f35501d = i;
    }

    public void authSerialIdStatus(int i) {
        this.f35500c = i;
    }

    public int getAuthDeviceIdStatus() {
        return this.f35499b;
    }

    public int getAuthGenDataStatus() {
        return this.f35498a;
    }

    public int getAuthSerialIdStatus() {
        return this.f35500c;
    }

    public int getOtherDataStatus() {
        return this.f35501d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            str.hashCode();
            switch (str) {
                case "authority_serial_id":
                    return this.f35500c;
                case "authority_device_id":
                    return this.f35499b;
                case "authority_general_data":
                    return this.f35498a;
                case "authority_other":
                    return this.f35501d;
            }
        }
        return 1;
    }
}
