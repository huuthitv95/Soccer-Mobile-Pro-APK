package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
interface StartActivityDelegate {
    Activity getActivityContext();

    void startActivityForResult(Intent intent, int i);
}
