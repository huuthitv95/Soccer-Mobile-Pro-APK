package com.bytedance.sdk.component.p145fi.p146lr.p152lr;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2600ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2601ka;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2605ri;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri;
import com.bytedance.sdk.component.p145fi.tan;
import com.bytedance.sdk.component.utils.C2715di;
import com.bytedance.sdk.component.utils.C2727sf;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2617ka<T> implements InterfaceC2614di {
    /* JADX INFO: renamed from: lr */
    private void m9727lr(final C2600ik c2600ik, final byte[] bArr, final C2605ri c2605ri) {
        try {
            new C2604ri().m9691ri(bArr, c2600ik.slm(), new C2604ri.ri() { // from class: com.bytedance.sdk.component.fi.lr.lr.ka.2
                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9693ri() {
                    c2605ri.m9696ri(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9694ri(Drawable drawable) {
                    c2605ri.m9697ri(new C2601ka().m9675ri(c2600ik, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9695ri(byte[] bArr2) {
                    if (C2715di.m10216ri(bArr)) {
                        C2617ka.this.m9729ri(c2600ik, bArr, true, c2605ri);
                    } else {
                        c2605ri.m9696ri(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            c2605ri.m9696ri(2000, "decode gif error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9728ri(final C2600ik c2600ik, final byte[] bArr, final C2605ri c2605ri) {
        try {
            new C2604ri().m9692ri(bArr, new C2604ri.ri() { // from class: com.bytedance.sdk.component.fi.lr.lr.ka.1
                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9693ri() {
                    c2605ri.m9696ri(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9694ri(Drawable drawable) {
                    c2605ri.m9697ri(new C2601ka().m9675ri(c2600ik, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2604ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo9695ri(byte[] bArr2) {
                    if (C2715di.m10216ri(bArr)) {
                        C2617ka.this.m9729ri(c2600ik, bArr, true, c2605ri);
                    } else {
                        c2605ri.m9696ri(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            c2605ri.m9696ri(2000, "decode webp animation error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m9729ri(C2600ik c2600ik, byte[] bArr, boolean z, C2605ri c2605ri) {
        try {
            C2598di c2598diSlm = c2600ik.slm();
            Bitmap bitmapM9687ri = c2598diSlm.m9594ri(c2600ik).m9687ri(bArr, c2598diSlm);
            if (bitmapM9687ri == null) {
                c2600ik.m9626mj();
                c2600ik.mo9571ri();
                c2605ri.m9696ri(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
                return;
            }
            c2600ik.m9626mj();
            c2600ik.mo9571ri();
            bitmapM9687ri.getWidth();
            bitmapM9687ri.getHeight();
            bitmapM9687ri.getByteCount();
            c2605ri.m9697ri(new C2601ka().m9675ri(c2600ik, bitmapM9687ri, null, false));
            if (z) {
                m9731ri(c2600ik.m9620bu(), c2598diSlm, c2600ik.m9626mj(), bitmapM9687ri);
            }
        } catch (Throwable th) {
            c2600ik.m9626mj();
            c2600ik.mo9571ri();
            c2605ri.m9696ri(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9731ri(InterfaceC2597lr interfaceC2597lr, C2598di c2598di, String str, Bitmap bitmap) {
        if (interfaceC2597lr == null || c2598di == null || !interfaceC2597lr.mo9574fi()) {
            return;
        }
        c2598di.m9592ri(interfaceC2597lr).mo9705ri(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public String mo9721ri() {
        return "decode";
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public boolean mo9722ri(C2600ik c2600ik, tan tanVar, C2605ri c2605ri) {
        byte[] bArrM9619aw = c2600ik.m9619aw();
        if (bArrM9619aw == null) {
            c2605ri.m9696ri(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iM9633sf = c2600ik.m9633sf();
        c2600ik.m9629ri(bArrM9619aw.length);
        if (iM9633sf == 2) {
            boolean z = (C2715di.m10215lr(bArrM9619aw) || C2727sf.m10279ri(bArrM9619aw, 0)) ? false : true;
            if (C2715di.m10216ri(bArrM9619aw)) {
                m9729ri(c2600ik, bArrM9619aw, z, c2605ri);
            } else {
                c2605ri.m9696ri(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iM9633sf == 3) {
            c2605ri.m9697ri(new C2601ka().m9675ri(c2600ik, bArrM9619aw, null, C2715di.m10215lr(bArrM9619aw)));
        } else if (C2715di.m10215lr(bArrM9619aw)) {
            m9727lr(c2600ik, bArrM9619aw, c2605ri);
        } else if (C2727sf.m10279ri(bArrM9619aw, 0)) {
            m9728ri(c2600ik, bArrM9619aw, c2605ri);
        } else if (C2715di.m10216ri(bArrM9619aw)) {
            m9729ri(c2600ik, bArrM9619aw, true, c2605ri);
        } else {
            c2605ri.m9696ri(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }
}
