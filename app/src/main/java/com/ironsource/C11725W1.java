package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.W1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11725W1 implements InterfaceC11408E0 {

    /* JADX INFO: renamed from: a */
    private final C12380n2 f26073a;

    /* JADX INFO: renamed from: com.ironsource.W1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26074a;

        static {
            int[] iArr = new int[EnumC11372C0.values().length];
            try {
                iArr[EnumC11372C0.LOAD_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11372C0.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11372C0.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11372C0.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC11372C0.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC11372C0.AUCTION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC11372C0.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC11372C0.AD_OPENED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC11372C0.AD_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC11372C0.SHOW_AD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC11372C0.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC11372C0.AD_CLICKED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC11372C0.AD_REWARDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC11372C0.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC11372C0.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC11372C0.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f26074a = iArr;
        }
    }

    public C11725W1(C12380n2 auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f26073a = auctionData;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m27785b(EnumC11372C0 enumC11372C0) {
        switch (a.f26074a[enumC11372C0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        JSONObject jSONObjectM32808h = this.f26073a.m32808h();
        if (jSONObjectM32808h != null && jSONObjectM32808h.length() > 0) {
            map.put("genericParams", jSONObjectM32808h);
        }
        if (m27785b(event)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f26073a.m32809i()));
            if (!TextUtils.isEmpty(this.f26073a.m32806f())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f26073a.m32806f());
            }
        }
        if (!TextUtils.isEmpty(this.f26073a.m32807g())) {
            map.put("auctionId", this.f26073a.m32807g());
        }
        return map;
    }
}
