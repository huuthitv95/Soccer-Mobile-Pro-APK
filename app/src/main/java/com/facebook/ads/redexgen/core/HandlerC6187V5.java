package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.V5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC6187V5 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final C6310X9 A03;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, Ascii.DC2, Ascii.DLE, Ascii.f22494GS, 0, 19, Ascii.f22492FF, 2, 10, 3, Ascii.f22494GS, 9, 3, Ascii.ETB, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, Ascii.NAK, Ascii.SYN, Ascii.DC4, 33, Ascii.NAK, 7, Ascii.DC4, Ascii.CAN, Ascii.f22503VT, 5, 7, 33, Ascii.NAK, 6, Ascii.f22490CR, 33, Ascii.CAN, 7, Ascii.DC4, Ascii.NAK, Ascii.f22503VT, 17, Ascii.DLE};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = HandlerC6187V5.class.getSimpleName();
    }

    public HandlerC6187V5(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = C6310X9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C7017id A01(C7012iY c7012iY, String str) {
        C7017id c7017id = new C7017id(c7012iY, this.A03, str);
        c7017id.A0G(c7012iY.A0B(), c7012iY.A07());
        return c7017id;
    }

    private C7013iZ A02(C6997iI c6997iI, String str) {
        C7013iZ c7013iZ = new C7013iZ(c6997iI, this.A03, str);
        c7013iZ.A0J(c6997iI.A05, c6997iI.A02, c6997iI.A08);
        return c7013iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    C6310X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C6902gi c6902giA05 = C5987Rp.A05(this.A00, callingAppPackage);
            c6902giA05.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    C6310X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                c6902giA05.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    C6184V2 c6184v2A04 = C6310X9.A00().A04(callingAppPackage);
                    if (c6184v2A04 == null) {
                        c6184v2A04 = C6310X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C7012iY intAdModel = AbstractC5787OX.A04(c6902giA05, msg.getData(), strVerifyPackage);
                    if (c6184v2A04.A00 == null) {
                        c6184v2A04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (c6184v2A04.A00 instanceof C7017id) {
                        ((C7017id) c6184v2A04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    C6310X9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    C6310X9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    C6184V2 c6184v2A05 = C6310X9.A00().A04(callingAppPackage);
                    if (c6184v2A05 == null) {
                        c6184v2A05 = C6310X9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C6997iI c6997iIA05 = AbstractC5787OX.A05(c6902giA05, msg.getData(), strVerifyPackage);
                    if (c6184v2A05.A00 == null) {
                        c6184v2A05.A00 = A02(c6997iIA05, callingAppPackage);
                    } else if (c6184v2A05.A00 instanceof C7013iZ) {
                        C7013iZ c7013iZ = (C7013iZ) c6184v2A05.A00;
                        String adId = c6997iIA05.A05;
                        c7013iZ.A0J(adId, c6997iIA05.A02, c6997iIA05.A08);
                    }
                    C6310X9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    InterfaceC5770OG interfaceC5770OGA03 = C6310X9.A00().A03(callingAppPackage);
                    if (interfaceC5770OGA03 instanceof C7013iZ) {
                        RewardData rewardDataA01 = AbstractC5788OY.A01(msg.getData());
                        C7013iZ c7013iZ2 = (C7013iZ) interfaceC5770OGA03;
                        if (rewardDataA01 != null) {
                            c7013iZ2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            AbstractC6271WU.A00(th, this);
        }
    }
}
