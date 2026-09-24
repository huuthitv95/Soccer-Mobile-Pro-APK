package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Df */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5116Df extends ImageView implements InterfaceC6790eu {
    public static byte[] A06;
    public static String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public C5183Ek A00;
    public final Paint A01;
    public final RectF A02;
    public final C6902gi A03;
    public final C6200VI A04;
    public final AbstractC5128Dr A05;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, Ascii.DC4, Ascii.NAK, 4, 65, 32, 5};
    }

    static {
        A06();
        A09 = (int) (AbstractC6334XX.A02 * 4.0f);
        A08 = (int) (AbstractC6334XX.A02 * 6.0f);
    }

    public C5116Df(C6902gi c6902gi, C6200VI c6200vi) {
        this(c6902gi, c6200vi, false);
    }

    public C5116Df(C6902gi c6902gi, C6200VI c6200vi, boolean z) {
        super(c6902gi);
        this.A05 = new AbstractC5128Dr() { // from class: com.facebook.ads.redexgen.X.3W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5129Ds c5129Ds) {
                this.A00.A09();
            }
        };
        this.A04 = c6200vi;
        this.A03 = c6902gi;
        if (z) {
            this.A02 = new RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new ViewOnClickListenerC6807fB(this));
    }

    private void A04() {
        setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AAv(C5183Ek c5183Ek) {
        this.A00 = c5183Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AKV(C5183Ek c5183Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int x = getHeight();
        int y = x / 2;
        if (this.A02 != null) {
            RectF rectF = this.A02;
            int x2 = getWidth();
            float f = x2;
            int x3 = getHeight();
            rectF.set(0.0f, 0.0f, f, x3);
            RectF rectF2 = this.A02;
            int x4 = A08;
            float f2 = x4;
            if (A07[3].charAt(1) == 84) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x5 = A08;
            canvas.drawRoundRect(rectF2, f2, x5, this.A01);
        } else {
            int x6 = Math.min(width, y);
            canvas.drawCircle(width, y, x6, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i) {
        this.A01.setColor(i);
    }
}
