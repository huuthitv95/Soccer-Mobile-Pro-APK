package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p151ri;

import com.bytedance.sdk.component.p145fi.InterfaceC2595ik;
import com.bytedance.sdk.component.utils.C2725qt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2612lr implements InterfaceC2595ik {

    /* JADX INFO: renamed from: lr */
    private C2613ri f7366lr;

    /* JADX INFO: renamed from: ri */
    private int f7367ri;

    public C2612lr(File file, long j) {
        int i = (int) j;
        this.f7367ri = i;
        this.f7366lr = C2613ri.m9713ri(i, file);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public boolean mo9703lr(String str) {
        try {
            InputStream inputStreamM9716ri = this.f7366lr.m9716ri(str);
            boolean z = inputStreamM9716ri != null;
            C2725qt.m10269ri(inputStreamM9716ri);
            return z;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                C2725qt.m10269ri(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] mo9704ri(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamM9716ri;
        C2613ri c2613ri = this.f7366lr;
        if (c2613ri != null && str != null) {
            try {
                inputStreamM9716ri = c2613ri.m9716ri(str);
                if (inputStreamM9716ri != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStreamM9716ri.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            C2725qt.m10269ri(inputStreamM9716ri);
                            C2725qt.m10269ri(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        C2725qt.m10269ri(inputStreamM9716ri);
                        C2725qt.m10269ri(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C2725qt.m10269ri(inputStreamM9716ri);
                    C2725qt.m10269ri(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamM9716ri = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamM9716ri = null;
            }
            C2725qt.m10269ri(inputStreamM9716ri);
            C2725qt.m10269ri(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2595ik
    /* JADX INFO: renamed from: ri */
    public InputStream mo9568ri(String str) {
        C2613ri c2613ri = this.f7366lr;
        if (c2613ri == null) {
            return null;
        }
        return c2613ri.m9716ri(str);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9705ri(String str, byte[] bArr) {
        C2613ri c2613ri = this.f7366lr;
        if (c2613ri == null || bArr == null || str == null) {
            return false;
        }
        return c2613ri.m9718ri(str, bArr);
    }
}
