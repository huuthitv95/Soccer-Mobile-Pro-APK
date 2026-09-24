package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC5560Kr extends AbstractC6586bb implements View.OnClickListener {
    public static byte[] A0E;
    public static String[] A0F = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0G;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C6902gi A05;
    public C6325XO A06;
    public C5566Kx A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C6580bV A0C;
    public final Map<String, String> A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, Ascii.f22493FS, 38, Ascii.DC2, 41, -27, Ascii.DC2, Ascii.ETB, Ascii.CAN, 38, Ascii.f22493FS, Ascii.SUB, 33, 93, 91, 77, 90, 75, 84, 81, 75, 83};
    }

    static {
        A04();
        A0G = (int) (AbstractC6334XX.A02 * 24.0f);
    }

    public ViewOnClickListenerC5560Kr(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, C5728Na c5728Na, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, InterfaceC6344Xh interfaceC6344Xh) {
        this(c6902gi, abstractC7077jd.A0w(), c5728Na, abstractC7077jd.A29().A0J().A06(), interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, abstractC7077jd.A2A(), interfaceC6344Xh);
        this.A0C.A08(abstractC7077jd);
    }

    public ViewOnClickListenerC5560Kr(C6902gi c6902gi, String str, C5728Na c5728Na, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5734Ng c5734Ng) {
        this(c6902gi, str, c5728Na, false, interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, c5734Ng);
    }

    public ViewOnClickListenerC5560Kr(C6902gi c6902gi, String str, C5728Na c5728Na, boolean z, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5734Ng c5734Ng) {
        super(c6902gi, c5728Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c6902gi;
        this.A0A = z;
        this.A0C = new C6580bV(c6902gi, str, c6847fp, c6365y2, interfaceC6192VA, c5734Ng, interfaceC6406Yh);
        setOnClickListener(this);
        AbstractC6374YB.A0G(1001, this);
    }

    public ViewOnClickListenerC5560Kr(C6902gi c6902gi, String str, C5728Na c5728Na, boolean z, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5734Ng c5734Ng, InterfaceC6344Xh interfaceC6344Xh) {
        super(c6902gi, c5728Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c6902gi;
        this.A0A = z;
        this.A0C = new C6580bV(c6902gi, str, c6847fp, c6365y2, interfaceC6192VA, c5734Ng, interfaceC6406Yh, interfaceC6344Xh);
        setOnClickListener(this);
        AbstractC6374YB.A0G(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(AbstractC6386YN.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? EnumC6385YM.MESSENGER : EnumC6385YM.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0G, 0, A0G, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            C6325XO c6325xo = this.A06;
            if (A0F[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c6325xo.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC7077jd abstractC7077jd) {
        return ((long) abstractC7077jd.A25()) > 0 && abstractC7077jd.A23() >= 0;
    }

    public final EnumC5683Mq A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return EnumC5683Mq.A09;
        }
        A03();
        this.A0D.put(A01(0, 12, 6), str);
        this.A0D.put(A01(24, 12, 58), String.valueOf(this.A0B));
        return this.A0C.A05(this.A08, this.A09, this.A0D);
    }

    public final boolean A0F(AbstractC7077jd abstractC7077jd, AbstractC6400Yb abstractC6400Yb) {
        if (this.A06 != null || !A05(abstractC7077jd) || abstractC7077jd.A2D().A02() == null || abstractC7077jd.A2D().A01() == null) {
            return false;
        }
        this.A07 = new C5566Kx(abstractC7077jd.A23(), abstractC7077jd.A25(), abstractC7077jd.A24(), abstractC7077jd.A2D().A02(), abstractC7077jd.A2D().A01(), abstractC6400Yb, this);
        this.A06 = new C6325XO(abstractC7077jd.A25(), this.A07);
        this.A06.A07();
        return true;
    }

    public C6580bV getCtaActionHelper() {
        return this.A0C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            A0E(A01(36, 9, 111));
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C6329XS c6329xs) {
        this.A0C.A09(c6329xs);
    }

    public void setCta(C5730Nc c5730Nc, String str, Map<String, String> extraData) {
        setCta(c5730Nc, str, extraData, null);
    }

    public void setCta(C5730Nc c5730Nc, String str, Map<String, String> extraData, InterfaceC6344Xh interfaceC6344Xh, InterfaceC6579bU interfaceC6579bU) {
        setCta(c5730Nc, str, extraData, interfaceC6579bU);
        this.A0C.A0A(interfaceC6344Xh);
    }

    public void setCta(C5730Nc c5730Nc, String str, Map<String, String> extraData, InterfaceC6579bU interfaceC6579bU) {
        this.A08 = str;
        this.A09 = c5730Nc.A05();
        this.A0D.putAll(extraData);
        this.A0C.A0B(interfaceC6579bU);
        String strA04 = c5730Nc.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0C.A0C(z);
    }

    public void setV2Design(boolean z) {
        this.A0B = z;
    }
}
