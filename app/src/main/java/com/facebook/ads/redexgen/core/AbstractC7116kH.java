package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7116kH extends AbstractC5686Mt {
    public static String A04;
    public static String A05;
    public static String A06;
    public static byte[] A07;
    public static String[] A08 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public int A00;
    public final boolean A01;
    public final C5692N0 A02;
    public final boolean A03;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        byte[] bArr = {60, 19, Ascii.SYN, Ascii.f22493FS, Ascii.DC4, 95, 19, Ascii.DLE, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.ETB, Ascii.f22494GS, Ascii.f22503VT, Ascii.SYN, Ascii.DLE, Ascii.f22494GS, 87, Ascii.DLE, Ascii.ETB, Ascii.f22490CR, Ascii.f22493FS, Ascii.ETB, Ascii.f22490CR, 87, Ascii.CAN, Ascii.SUB, Ascii.f22490CR, Ascii.DLE, Ascii.SYN, Ascii.ETB, 87, 47, 48, 60, 46, 17, Ascii.DC2, Ascii.DLE, Ascii.CAN, 44, 7, Ascii.SUB, Ascii.f22498RS, Ascii.SYN, 35, 42, 46, 57, 42, Ascii.DLE, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, 63, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, Ascii.DC4, Ascii.DC2, 4, 19, 62, Ascii.NAK, 19, 0, 2, 10, 4, 19, 62, 8, Ascii.DC2, 62, Ascii.f22499SI, Ascii.f22500SO, Ascii.NAK, 62, Ascii.f22499SI, Ascii.DC4, Ascii.f22490CR, Ascii.f22490CR, 7, 1, Ascii.ETB, 0, 17, Ascii.f22498RS, Ascii.ESC, 17, Ascii.f22491EM, 111, 121, 108, 123, 112, 71, 121, 118, 124, 71, 122, 106, 119, 111, 107, 125};
        if (A08[1].length() != 9) {
            throw new RuntimeException();
        }
        A08[7] = "E0qxoPtldo8saq";
        A07 = bArr;
    }

    public abstract EnumC5683Mq A0H();

    static {
        A0E();
        A04 = A0D(64, 7, 106);
        A05 = A0D(85, 24, 81);
        A06 = A0D(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 16, 40);
    }

    public AbstractC7116kH(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, C5692N0 c5692n0, boolean z) {
        this(c6902gi, interfaceC6192VA, str, c5692n0, z, false);
    }

    public AbstractC7116kH(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, C5692N0 c5692n0, boolean z, boolean z2) {
        super(c6902gi, interfaceC6192VA, str);
        this.A00 = 0;
        this.A02 = c5692n0;
        this.A03 = z;
        this.A01 = z2;
        if (this.A02 != null) {
            this.A02.A07(new InterfaceC5685Ms() { // from class: com.facebook.ads.redexgen.X.kI
                @Override // com.facebook.ads.redexgen.core.InterfaceC5685Ms
                public final void AFa() {
                    this.A00.A0I();
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5686Mt
    public final EnumC5683Mq A0G(String str) {
        if (this.A02 != null) {
            this.A02.A08(super.A03);
        }
        if (C6580bV.A04(super.A01)) {
            return EnumC5683Mq.A06;
        }
        if (A0L(str)) {
            return EnumC5683Mq.A06;
        }
        return A0H();
    }

    public final /* synthetic */ void A0I() {
        this.A00++;
        if (A0L(null)) {
            InterfaceC5684Mr interfaceC5684Mr = super.A00;
            if (A08[1].length() != 9) {
                throw new RuntimeException();
            }
            A08[0] = "ZLZB3DtfqcSTIr4ga6zBSlI";
            if (interfaceC5684Mr != null) {
                super.A00.ACk();
            }
        }
    }

    public final void A0J(Map<String, String> extraData, EnumC5683Mq enumC5683Mq) {
        if (!TextUtils.isEmpty(super.A03)) {
            if (this instanceof C479287) {
                super.A02.AC8(super.A03, extraData);
            } else {
                super.A02.ABM(super.A03, extraData);
            }
            boolean zA02 = EnumC5683Mq.A02(enumC5683Mq);
            boolean z = this.A02 != null;
            boolean isError = C6171Up.A2U(super.A01);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !zA02;
                navigationDataMap.put(A04, Boolean.toString(isError2));
                navigationDataMap.put(A05, Boolean.toString(z));
                String str = A06;
                boolean isError3 = this.A01;
                navigationDataMap.put(str, Boolean.toString(isError3));
                super.A02.ABn(super.A03, navigationDataMap);
            }
            if (this.A02 != null) {
                this.A02.A06(enumC5683Mq);
                if (zA02) {
                    this.A02.A05();
                }
            } else {
                HashMap map = new HashMap();
                map.put(A0D(47, 10, 127), Long.toString(-1L));
                map.put(A0D(38, 9, 67), Long.toString(-1L));
                map.put(A0D(57, 7, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), EnumC5683Mq.A05.name());
                super.A02.AC9(super.A03, map);
            }
        }
        AbstractC6319XI.A04(super.A01, A0D(0, 12, 79));
    }

    public final boolean A0K(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0D(71, 14, 4));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0D(12, 26, 73), AbstractC6312XB.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C6297Wu.A0D(super.A01, intent);
        } catch (C6295Ws unused) {
            return false;
        }
    }

    public final boolean A0L(String str) {
        return (str == null || !str.equals(A0D(109, 9, 66))) && this.A00 != 0 && this.A00 >= C6171Up.A0I(super.A01);
    }
}
