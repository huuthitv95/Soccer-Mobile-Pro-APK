package com.mbridge.msdk.config.component.load.downloader.resource;

import com.mbridge.msdk.config.component.load.downloader.resource.stream.C12817b;
import com.mbridge.msdk.config.component.load.downloader.resource.stream.InterfaceC12816a;
import com.mbridge.msdk.config.component.load.downloader.utils.C12818a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.resource.a */
/* JADX INFO: compiled from: MBResourceManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12815a {

    /* JADX INFO: renamed from: a */
    private static volatile C12815a f34242a;

    private C12815a() {
    }

    /* JADX INFO: renamed from: a */
    public static C12815a m35497a() {
        if (f34242a == null) {
            synchronized (C12815a.class) {
                if (f34242a == null) {
                    f34242a = new C12815a();
                }
            }
        }
        return f34242a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12816a m35500b(File file) throws IOException {
        if (file == null) {
            throw new IOException("file is null");
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        return new C12817b(file);
    }

    /* JADX INFO: renamed from: c */
    public long m35501c(File file) {
        if (C12818a.m35508b(file)) {
            try {
                return file.length();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m35499a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m35499a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: a */
    public String m35498a(String str) {
        try {
            URL url = new URL(str);
            String str2 = url.getProtocol() + "://" + url.getHost() + url.getPath();
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str2.getBytes("UTF-8"));
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }
}
