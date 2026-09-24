package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2604ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.lr.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo9693ri();

        /* JADX INFO: renamed from: ri */
        void mo9694ri(Drawable drawable);

        /* JADX INFO: renamed from: ri */
        void mo9695ri(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m9688lr(byte[] bArr, C2598di c2598di, ri riVar) {
        FileOutputStream fileOutputStream = null;
        try {
            File fileM10332ri = xha.m10332ri(c2598di.m9591ri(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM10332ri);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileM10332ri));
                    if (riVar != null) {
                        riVar.mo9694ri(drawableDecodeDrawable);
                    }
                } else if (riVar != null) {
                    riVar.mo9695ri(bArr);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    C2707ac.m10206ri("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (riVar != null) {
                        riVar.mo9693ri();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m9690ri(final byte[] bArr, final ri riVar, final C2598di c2598di) {
        try {
            c2598di.m9590mj().submit(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.lr.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C2604ri.this.m9688lr(bArr, c2598di, riVar);
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("PAGGifDefaultDecoder", th.getMessage());
            if (riVar != null) {
                riVar.mo9693ri();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9691ri(byte[] bArr, C2598di c2598di, ri riVar) {
        if (Build.VERSION.SDK_INT <= 30) {
            m9690ri(bArr, riVar, c2598di);
        } else {
            m9692ri(bArr, riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m9692ri(byte[] bArr, ri riVar) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (riVar != null) {
                riVar.mo9695ri(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (riVar != null) {
                riVar.mo9694ri(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("PAGGifDefaultDecoder", th.getMessage());
            if (riVar != null) {
                riVar.mo9693ri();
            }
        }
    }
}
