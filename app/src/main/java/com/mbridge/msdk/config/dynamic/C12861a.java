package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.a */
/* JADX INFO: compiled from: ComponentInflater.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12861a {
    /* JADX INFO: renamed from: a */
    private View m35885a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m35886a(String str, ViewGroup viewGroup, C12894a c12894a) {
        if (!new File(str).exists()) {
            return null;
        }
        View viewM36070a = C12898c.m36066a().m36070a(str, viewGroup, c12894a);
        return viewM36070a != null ? viewM36070a : m35885a();
    }
}
