package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri.C1986ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile InterfaceC2005lr MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    /* JADX INFO: renamed from: ri */
    private static String f7911ri;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static InterfaceC2005lr getICacheDir(int i) {
        return m10461ri();
    }

    public static String getImageCacheDir(String str) {
        if (f7911ri == null) {
            f7911ri = getDiskCacheDirPath(str);
        }
        return f7911ri;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileM10331ri = xha.m10331ri(C3299nr.m14642ri(), "tt_ad");
        if (fileM10331ri.isFile()) {
            fileM10331ri.delete();
        }
        if (!fileM10331ri.exists()) {
            fileM10331ri.mkdirs();
        }
        String absolutePath = fileM10331ri.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    /* JADX INFO: renamed from: ri */
    private static InterfaceC2005lr m10461ri() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    C1986ri c1986ri = new C1986ri();
                    MEDIA_CACHE_DIR = c1986ri;
                    c1986ri.mo6275ri(getRootDir());
                    MEDIA_CACHE_DIR.mo6271ka();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
