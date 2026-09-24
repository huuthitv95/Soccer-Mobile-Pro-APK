package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.om */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SurfaceHolderCallbackC7379om implements InterfaceC5286GQ, InterfaceC48358p, InterfaceC5165ES, InterfaceC4994Bf, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ C4901AA A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final /* synthetic */ void AD4(C7472qI c7472qI, C46826L c46826l) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final /* synthetic */ void AD5(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final /* synthetic */ void AD6(Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final /* synthetic */ void ADU(int i, long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final /* synthetic */ void AFy(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final /* synthetic */ void AGV(C7472qI c7472qI, C46826L c46826l) {
    }

    public SurfaceHolderCallbackC7379om(C4901AA c4901aa) {
        this.A00 = c4901aa;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final void AD0(String str, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (zHasNext) {
                ((InterfaceC48358p) it.next()).AD0(str, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final void AD1(C46796I c46796i) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC48358p) it.next()).AD1(c46796i);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final void AD2(C46796I c46796i) {
        this.A00.A09 = c46796i;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC48358p) it.next()).AD2(c46796i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final void AD3(C7472qI c7472qI) {
        this.A00.A07 = c7472qI;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC48358p) it.next()).AD3(c7472qI);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC48358p
    public final void AD9(int i, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((InterfaceC48358p) it.next()).AD9(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5165ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADZ(C7420pR c7420pR) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC45063U) it.next()).ADZ(c7420pR);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5165ES
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADa(List<C7422pT> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC45063U) it.next()).ADa(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void ADl(int i, long j) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC5286GQ) it.next()).ADl(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4994Bf
    public final void AEt(Metadata metadata, long j) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((InterfaceC4994Bf) it.next()).AEt(metadata, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AFf(Object obj, long j) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5286GQ) it2.next()).AFf(obj, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AGN(String str, long j, long j2) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC5286GQ) it.next()).AGN(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AGO(C46796I c46796i) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC5286GQ) it.next()).AGO(c46796i);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AGP(C46796I c46796i) {
        this.A00.A0A = c46796i;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (zHasNext) {
                ((InterfaceC5286GQ) it.next()).AGP(c46796i);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AGU(C7472qI c7472qI) {
        this.A00.A08 = c7472qI;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (zHasNext) {
                ((InterfaceC5286GQ) it.next()).AGU(c7472qI);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5286GQ
    public final void AGb(C7425pW c7425pW) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC46205L) it.next()).AGa(c7425pW.A03, c7425pW.A01, c7425pW.A02, c7425pW.A00);
        }
        for (InterfaceC5286GQ interfaceC5286GQ : this.A00.A0K) {
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            interfaceC5286GQ.AGb(c7425pW);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
