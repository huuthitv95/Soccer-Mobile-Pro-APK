package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6297Wu {
    public static byte[] A00;
    public static String[] A01 = {"WbJlBxxP9hhDyVkliYvNWFvleez5wFba", "Us5Q3ca4sjVLZknlXhQB6hWi1VD5Erza", "gJqO8U9bMVlcsLp5HSGrl2qXu5TMOPYV", "P57OBps6tL2979s4xCAUfWnFOcUQoKvX", "CjMQtwUDrO8ZQ06PzRRzPVuypWFQdtNK", "DynPiig1xYxCb14sB97Y7RAQimyT6aIC", "zcq0zXyldopis2WSYxgyl16P5Uge3oHA", "fUMP1AC"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C6902gi> A06;
    public static final AtomicReference<InterfaceC6304X3> A07;
    public static final AtomicReference<InterfaceC6306X5> A08;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{89, 54, 51, 57, 32, 40, 54, 51, 40, 56, 53, Base64.padSymbol, 40, 62, 51, 40, 60, 50, 46, 57, 86, 83, 89, SignedBytes.MAX_POWER_OF_TWO, 72, 88, 69, 94, 80, 94, 89, 86, 91, 72, 82, 79, 67, 69, 86, 68, Ascii.NAK, 122, 127, 117, 108, 100, 104, 122, 109, 126, 127, 100, 104, 111, 122, 111, 126, 100, 127, 122, 111, 122, 75, 121, 110, 125, 124, 56, 107, 108, 121, 108, 125, 56, 122, 109, 118, 124, 116, 125, 56, 113, 107, 56, 125, 117, 104, 108, 97, 57, Ascii.ETB, Ascii.NAK, 2, 41, 3, 2, Ascii.f22502US, Ascii.SUB, Ascii.SUB, Ascii.NAK, 36, Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.f22498RS, Ascii.NAK, Ascii.f22499SI, 36, Ascii.f22499SI, Ascii.DC4, Ascii.DLE, Ascii.f22498RS, Ascii.NAK, 100, 104, 106, 41, 97, 102, 100, 98, 101, 104, 104, 108, 41, 102, 99, 116, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 110, 119, 100, 41, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 85, 98, 106, 104, 115, 98, 70, 100, 115, 110, 113, 110, 115, 126, 109, 100, 107, 97, 105, 96, 80, 119, 108, 67, 106, 119, 87, 96, 118, 112, 105, 113, Ascii.f22499SI, 8, Ascii.f22494GS, Ascii.f22500SO, 8, Base64.padSymbol, Ascii.f22502US, 8, Ascii.NAK, 10, Ascii.NAK, 8, 5, 3, 4, 17, 2, 4, 49, 19, 4, Ascii.f22491EM, 6, Ascii.f22491EM, 4, 9, 54, Ascii.f22502US, 2, 34, Ascii.NAK, 3, 5, Ascii.f22493FS, 4};
    }

    static {
        A08();
        A02 = C6297Wu.class.getPackage();
        A04 = A02 + A07(40, 22, 116);
        A03 = A02 + A07(0, 19, 56);
        A05 = A02 + A07(19, 21, 88);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static int A00(C6902gi c6902gi, Intent intent) throws C6295Ws {
        Intent intentA01 = A01(intent);
        int usedContext = 0;
        try {
            Activity activityA00 = ActivityUtils.A00();
            if (activityA00 == null) {
                activityA00 = c6902gi.A0E();
                usedContext = 1;
            }
            if (activityA00 != null) {
                activityA00.startActivity(intentA01);
                return usedContext;
            }
            intentA01.addFlags(268435456);
            c6902gi.startActivity(intentA01);
            return 2;
        } catch (ActivityNotFoundException e) {
            throw new C6295Ws(e);
        }
    }

    public static Intent A01(Intent intent) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(intent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A02(Intent intent, ClassLoader classLoader) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            audienceNetworkActivityBundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(audienceNetworkActivityBundle);
        return intentCloneFilter;
    }

    public static Bundle A03(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            if (A01[2].charAt(4) != '8') {
                throw new RuntimeException();
            }
            A01[7] = "Zue8yRDoBrDWRSev";
            parcelObtain.recycle();
            return bundle2;
        }
        throw new IllegalStateException(A07(62, 28, 87));
    }

    public static C6902gi A04(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C6902gi c6902gi : A06) {
                String adId = c6902gi.A0F().getId();
                if (stringExtra.equals(adId)) {
                    return c6902gi;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A05(C6902gi c6902gi) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c6902gi.getApplicationContext(), A06());
        adActivityIntent.putExtra(A03, c6902gi.A0F().getId());
        A06.add(c6902gi);
        return adActivityIntent;
    }

    public static Class A06() {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            try {
                return Class.forName(A07(113, 59, 72));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return AudienceNetworkActivity.class;
    }

    public static void A09(Activity activity, Intent intent) throws C6295Ws {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            throw new C6295Ws(e);
        }
    }

    public static void A0A(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A0B(C6902gi c6902gi, AdActivityIntent adActivityIntent) throws C6295Ws {
        Context launchContext;
        Context applicationContext = c6902gi.getApplicationContext();
        if (C6171Up.A2d(c6902gi) && (launchContext = c6902gi.A0E()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0I(c6902gi, adActivityIntent)) {
                    c6902gi.A0F().AIC();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A01(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new C6295Ws(e);
        }
    }

    public static boolean A0C(Intent intent, Set<String> set) {
        Uri intentUri = intent.getData();
        if (intentUri == null) {
            return false;
        }
        String string = intentUri.toString();
        Iterator<String> it = set.iterator();
        do {
            boolean zHasNext = it.hasNext();
            if (A01[5].charAt(30) != 'I') {
                throw new RuntimeException();
            }
            A01[2] = "hOpA8yyYIRQLuX6WeWELRCriZfzSUGqk";
            if (!zHasNext) {
                return false;
            }
        } while (!string.startsWith(it.next()));
        return true;
    }

    public static boolean A0D(C6902gi c6902gi, Intent intent) throws C6295Ws {
        A07.get();
        return A0F(c6902gi, intent, null);
    }

    public static boolean A0E(C6902gi c6902gi, Intent intent) throws C6295Ws {
        A07.get();
        if (0 != 0) {
            Activity activityA0E = c6902gi.A0E();
            if (A01[7].length() == 30) {
                throw new RuntimeException();
            }
            A01[7] = "PLLjYBDqb811z0Dn6rlZ87lQdZ7C";
            if (activityA0E != null) {
                c6902gi.A0C();
                try {
                    c6902gi.A0E();
                    throw new NullPointerException(A07(203, 22, 63));
                } catch (ActivityNotFoundException e) {
                    throw new C6295Ws(e);
                } catch (Exception e2) {
                    c6902gi.A08().ABC(A07(90, 8, 57), AbstractC6098Td.A07, new C6099Te(e2));
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean A0F(C6902gi c6902gi, Intent intent, InterfaceC6304X3 interfaceC6304X3) throws C6295Ws {
        if (A0C(intent, C6171Up.A0Z(c6902gi))) {
            return false;
        }
        Context context = c6902gi;
        if (A01[1].charAt(5) != 'g') {
            A01[2] = "mGLT8eS8inmCxtBfGXr0XCfYNSNKmj30";
            Context startContext = c6902gi.A0E();
            if (startContext != null) {
                context = startContext;
            } else {
                intent.addFlags(268435456);
            }
            if (interfaceC6304X3 != null && !A0C(intent, C6171Up.A0b(c6902gi))) {
                c6902gi.A0C();
                try {
                    throw new NullPointerException(A07(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 13, 51));
                } catch (ActivityNotFoundException e) {
                    throw new C6295Ws(e);
                } catch (Exception e2) {
                    c6902gi.A08().ABC(A07(90, 8, 57), AbstractC6098Td.A08, new C6099Te(e2));
                    return false;
                }
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e3) {
                throw new C6295Ws(e3);
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0G(C6902gi c6902gi, Uri uri, String str) throws ActivityNotFoundException {
        A08.get();
        return A0H(c6902gi, uri, str, null);
    }

    public static boolean A0H(C6902gi c6902gi, Uri uri, String str, InterfaceC6306X5 interfaceC6306X5) throws ActivityNotFoundException {
        if (interfaceC6306X5 == null || c6902gi.A0E() == null) {
            return false;
        }
        new Bundle().putString(A07(98, 15, 52), str);
        uri.toString();
        c6902gi.A0E();
        throw new NullPointerException(A07(172, 18, 74));
    }

    public static boolean A0I(C6902gi c6902gi, AdActivityIntent adActivityIntent) throws C6295Ws {
        Intent intentA01 = A01(adActivityIntent);
        try {
            Activity currentActivity = ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c6902gi.A0E();
            }
            if (currentActivity == null) {
                return false;
            }
            currentActivity.startActivityForResult(intentA01, 0);
            return true;
        } catch (ActivityNotFoundException e) {
            throw new C6295Ws(e);
        }
    }
}
