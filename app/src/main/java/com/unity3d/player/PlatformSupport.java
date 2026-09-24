package com.unity3d.player;

import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class PlatformSupport {
    static final boolean LOLLIPOP_SUPPORT = true;
    static final boolean MARSHMALLOW_SUPPORT = true;
    static final boolean NOUGAT_SUPPORT;

    static {
        NOUGAT_SUPPORT = Build.VERSION.SDK_INT >= 24;
    }
}
