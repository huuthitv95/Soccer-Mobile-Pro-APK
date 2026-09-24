package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C9415C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.w0 */
/* JADX INFO: compiled from: SerializeTools.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13231w0 {
    /* JADX INFO: renamed from: a */
    public static String m37951a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C9415C.ISO88591_NAME);
        } catch (IOException e) {
            C13219q0.m37817b("SerializeTools", "IOException", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m37950a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C9415C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return object;
        } catch (Exception e) {
            C13219q0.m37817b("SerializeTools", "Exception", e);
            return null;
        }
    }
}
