package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TextureViewSurfaceTextureListenerC5074Cz extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC6826fU, InterfaceC6842fk, InterfaceC6828fW {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C6902gi A0A;
    public EnumC6789et A0B;
    public C6829fX A0C;
    public EnumC6844fm A0D;
    public EnumC6844fm A0E;
    public InterfaceC6845fn A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-56, -11, -11, -14, -11, -93, -20, -15, -93, -56, -5, -14, -45, -17, -28, -4, -24, -11, -93, -25, -8, -24, -93, -9, -14, -93, -14, -15, -42, -8, -11, -23, -28, -26, -24, -41, -24, -5, -9, -8, -11, -24, -57, -24, -10, -9, -11, -14, -4, -24, -25, -93, -25, -8, -11, -20, -15, -22, -93, -10, -24, -9, -39, -20, -25, -24, -14, -42, -8, -11, -23, -28, -26, -24, -93, -24, Ascii.ESC, Ascii.DC2, -13, Ascii.f22499SI, 4, Ascii.f22493FS, 8, Ascii.NAK, -61, 8, Ascii.NAK, Ascii.NAK, Ascii.DC2, Ascii.NAK, -61, Ascii.ETB, Ascii.NAK, Ascii.f22492FF, 10, 10, 8, Ascii.NAK, 8, 7, -61, 5, Ascii.f22493FS, -61, Ascii.DC2, 17, -10, Ascii.CAN, Ascii.NAK, 9, 4, 6, 8, -9, 8, Ascii.ESC, Ascii.ETB, Ascii.CAN, Ascii.NAK, 8, -25, 8, Ascii.SYN, Ascii.ETB, Ascii.NAK, Ascii.DC2, Ascii.f22493FS, 8, 7, -61, 7, Ascii.CAN, Ascii.NAK, Ascii.f22492FF, 17, 10, -61, 19, 4, Ascii.CAN, Ascii.SYN, 8, -61, -26, Ascii.f22500SO, Ascii.f22500SO, 6, Ascii.f22503VT, 4, -65, 0, Ascii.f22503VT, Ascii.SYN, 0, Ascii.CAN, Ascii.DC2, -65, 19, 7, 17, Ascii.f22500SO, Ascii.SYN, -65, 0, Ascii.f22490CR, -65, 4, Ascii.ETB, 2, 4, Ascii.f22499SI, 19, 8, Ascii.f22500SO, Ascii.f22490CR, -65, Ascii.SYN, 8, 19, 7, -65, Ascii.DC2, 4, 19, -31, 0, 2, 10, 6, 17, Ascii.f22500SO, Ascii.DC4, Ascii.f22490CR, 3, -29, 17, 0, Ascii.SYN, 0, 1, Ascii.f22503VT, 4, -65, Ascii.f22500SO, Ascii.f22490CR, -65, -19, Ascii.f22500SO, Ascii.DC4, 6, 0, 19, -65, 0, 1, Ascii.f22500SO, Ascii.NAK, 4, -51, -65, Ascii.DC2, Ascii.f22500SO, -65, Ascii.SYN, 4, -65, Ascii.DC2, 8, Ascii.f22503VT, 4, Ascii.f22490CR, 19, Ascii.f22503VT, Ascii.CAN, -65, 8, 6, Ascii.f22490CR, Ascii.f22500SO, 17, 4, -65, 8, 19, -51, -92, -52, -52, -60, -55, -62, 125, -66, -55, -44, -66, -42, -48, 125, -47, -59, -49, -52, -44, 125, -66, -53, 125, -62, -43, -64, -62, -51, -47, -58, -52, -53, 125, -44, -58, -47, -59, 125, -48, -62, -47, -93, -52, -49, -62, -60, -49, -52, -46, -53, -63, 125, -52, -53, 125, -85, -52, -46, -60, -66, -47, 125, -66, -65, -52, -45, -62, -117, 125, -48, -52, 125, -44, -62, 125, -48, -58, -55, -62, -53, -47, -55, -42, 125, -58, -60, -53, -52, -49, -62, 125, -58, -47, -117, -62, -43, -48, -47, -37, -116, -33, -32, -51, -32, -47, -116, -49, -44, -51, -38, -45, -47, -48, -116, -32, -37, -116, -25, -27, -18, -27, -14, -23, -29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C6171Up.A20(this.A0A)) {
            EnumC6844fm enumC6844fm = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC6844fm == EnumC6844fm.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AIz();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADy(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureViewSurfaceTextureListenerC5074Cz.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC5074Cz(C6902gi c6902gi) {
        super(c6902gi);
        this.A0D = EnumC6844fm.A04;
        this.A0E = EnumC6844fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC6789et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c6902gi;
    }

    public TextureViewSurfaceTextureListenerC5074Cz(C6902gi c6902gi, AttributeSet attributeSet) {
        super(c6902gi, attributeSet);
        this.A0D = EnumC6844fm.A04;
        this.A0E = EnumC6844fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC6789et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c6902gi;
    }

    public TextureViewSurfaceTextureListenerC5074Cz(C6902gi c6902gi, AttributeSet attributeSet, int i) {
        super(c6902gi, attributeSet, i);
        this.A0D = EnumC6844fm.A04;
        this.A0E = EnumC6844fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC6789et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c6902gi;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    private void A04() {
        this.A0C = new C6829fX(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity activityA0E = this.A0A.A0E();
            if (activityA0E != null) {
                this.A09 = new MediaController(activityA0E);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new C6835fd(this));
                this.A09.setEnabled(true);
            } else if (A0P[5].charAt(4) != 'y') {
                A0P[6] = "TO7k5EC8ZWp6tpojZW";
                this.A09 = null;
            } else {
                String[] strArr = A0P;
                strArr[0] = "fS";
                strArr[1] = "9d";
                this.A09 = null;
            }
        }
        if (this.A0G != null) {
            String str = this.A0G;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Pg";
            strArr2[1] = "vu";
            if (str.length() == 0 || this.A0K) {
                this.A0C.A0F(this.A0A.A02(), this.A06);
            }
        } else {
            this.A0C.A0F(this.A0A.A02(), this.A06);
        }
        setVideoState(EnumC6844fm.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        C6827fV videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC6844fm.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C6829fX.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void A9d() {
        if (!this.A0H) {
            AGr(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final boolean A9q() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final boolean A9r() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final boolean AAc() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6826fU
    public final void AFL(String str, Exception exc) {
        this.A0A.A0F().ACW(str);
        this.A0A.A0F().A3i(1);
        setVideoState(EnumC6844fm.A03);
        this.A0A.A08().ABC(A03(362, 7, 50), AbstractC6098Td.A1N, new C6099Te(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3 = com.facebook.ads.redexgen.core.EnumC6844fm.A05;
        r2 = com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC5074Cz.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r2[4].length() == r2[7].length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC5074Cz.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC6826fU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AFM(boolean r8, int r9) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC5074Cz.AFM(boolean, int):void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6828fW
    public final void AGa(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void AGr(boolean z, int i) {
        this.A0A.A0F().A3e(i);
        this.A0E = EnumC6844fm.A05;
        this.A0M = z;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC6844fm.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void AK1(int i) {
        this.A0A.A0F().ACX(i);
        setVideoState(EnumC6844fm.A09);
        AKF(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void AK6(EnumC6789et enumC6789et, int i) {
        this.A0A.A0F().A3p(i);
        this.A0M = false;
        this.A0E = EnumC6844fm.A0A;
        this.A0B = enumC6789et;
        if (this.A0C == null) {
            setup(this.A06);
            return;
        }
        if (this.A0D != EnumC6844fm.A07 && this.A0D != EnumC6844fm.A05 && this.A0D != EnumC6844fm.A06) {
            return;
        }
        this.A0C.A0I(true);
        EnumC6844fm enumC6844fm = EnumC6844fm.A0A;
        String[] strArr = A0P;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[0] = "Wi";
        strArr2[1] = "9L";
        setVideoState(enumC6844fm);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void AKF(int i) {
        this.A0A.A0F().A3r(i);
        this.A0E = EnumC6844fm.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC6844fm.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public EnumC6789et getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public EnumC6844fm getState() {
        return this.A0D;
    }

    public EnumC6844fm getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C6171Up.A2l(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC6844fm.A03);
            AKF(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC6844fm.A05 && !this.A0M) {
            AK6(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                try {
                    this.A0C.A0E(null);
                } catch (Exception e) {
                    this.A0A.A0F().ACW(A03(0, 75, 53) + e.getMessage());
                }
            }
        }
        if (this.A0D != EnumC6844fm.A05) {
            try {
                AGr(false, 5);
                return true;
            } catch (Exception e2) {
                this.A0A.A0F().ACW(A03(75, 68, 85) + e2.getMessage());
                return true;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC6844fm.A05) {
                if ((this.A0A.A0H().A01() || C6171Up.A25(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A9d();
                    return;
                }
            }
            return;
        }
        if (this.A0D != EnumC6844fm.A05 || this.A0M) {
            return;
        }
        AK6(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
        } else {
            this.A05 = i;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(143, 102, 81));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC6837ff(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(245, 94, 15));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC6836fe(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC6844fm.A08 && this.A0D != EnumC6844fm.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC6844fm enumC6844fm) {
        if (enumC6844fm != this.A0D) {
            if (this.A0A.A05().AAO()) {
                String str = A03(339, 23, 30) + enumC6844fm;
            }
            this.A0D = enumC6844fm;
            if (this.A0D == EnumC6844fm.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AGd(enumC6844fm);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setVideoStateChangeListener(InterfaceC6845fn interfaceC6845fn) {
        this.A0F = interfaceC6845fn;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6842fk
    public void setup(Uri uri) {
        this.A0A.A0F().A3h();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
