package com.bykv.p028vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FileLock {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Integer> f4483a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final int f4484b;

    /* JADX INFO: renamed from: c */
    private final String f4485c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i) {
        this.f4485c = str;
        this.f4484b = i;
    }

    /* JADX INFO: renamed from: a */
    public static FileLock m6060a(String str) {
        try {
            int iM6064d = m6064d(str);
            nLockFile(iM6064d);
            return new FileLock(str, iM6064d);
        } catch (Exception e) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static FileLock m6061a(String str, int i) {
        try {
            int iM6064d = m6064d(str);
            nLockFileSegment(iM6064d, i);
            return new FileLock(str, iM6064d);
        } catch (Exception e) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static FileLock m6062b(String str) {
        try {
            int iM6064d = m6064d(str);
            if (nTryLock(iM6064d)) {
                return new FileLock(str, iM6064d);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static FileLock m6063c(String str) throws Exception {
        try {
            int iM6064d = m6064d(str);
            if (nTryLock(iM6064d)) {
                return new FileLock(str, iM6064d);
            }
            new FileLock(str, iM6064d).m6066b();
            return null;
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m6064d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f4483a;
        synchronized (map) {
            numValueOf = map.get(str);
            if (numValueOf == null) {
                new File(str).getParentFile().mkdirs();
                numValueOf = Integer.valueOf(nGetFD(str));
                map.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    /* JADX INFO: renamed from: a */
    public final void m6065a() {
        try {
            nUnlockFile(this.f4484b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f4485c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6066b() {
        Integer numRemove;
        Map<String, Integer> map = f4483a;
        synchronized (map) {
            numRemove = map.remove(this.f4485c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.f4485c + " caused by:" + e.getMessage());
        }
    }
}
