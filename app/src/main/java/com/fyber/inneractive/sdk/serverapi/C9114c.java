package com.fyber.inneractive.sdk.serverapi;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.rtb.data.types.EnumC9109a;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.serverapi.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9114c implements InterfaceC9115d {

    /* JADX INFO: renamed from: c */
    public static final List f21365c = Arrays.asList(5);

    /* JADX INFO: renamed from: d */
    public static final List f21366d = Arrays.asList(Integer.valueOf(EnumC9109a.VAST_2_0.m21904a()), Integer.valueOf(EnumC9109a.VAST_2_0_WRAPPER.m21904a()));

    /* JADX INFO: renamed from: a */
    public C8006r f21367a;

    /* JADX INFO: renamed from: b */
    public final String f21368b;

    public C9114c(C8006r c8006r) {
        String networkOperator;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC9174o.f21470a.getSystemService("phone");
            networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() == 2 && AbstractC9162k.m21978n()) {
                networkOperator = telephonyManager.getSimOperator();
            }
        } catch (Exception unused) {
            networkOperator = null;
        }
        this.f21368b = networkOperator;
        this.f21367a = c8006r;
    }

    /* JADX INFO: renamed from: a */
    public static String m21921a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? "1" : "0";
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final String m21922a() {
        try {
            return ((TelephonyManager) AbstractC9174o.f21470a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21923a(String str, HashMap map) {
        String str2;
        C9112a c9112a = AbstractC9113b.f21363a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("headset", m21921a(AbstractC9113b.m21919m()));
        map.put("is_muted", m21921a(AbstractC9113b.m21917k()));
        map.put("btry_c", m21921a(AbstractC9113b.m21915i()));
        map.put("btry_l", AbstractC9113b.m21908b());
        map.put("bt_con", m21921a(AbstractC9113b.m21913g()));
        Long lM21911e = AbstractC9113b.m21911e();
        map.put("tod", lM21911e == null ? "" : String.valueOf(lM21911e));
        map.put("apnm", m21921a(AbstractC9113b.m21912f()));
        map.put("dnd", m21921a(AbstractC9113b.m21918l()));
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        map.put("lng", iAConfigManager.f17683o);
        String strM20456a = iAConfigManager.f17691w.m20456a(AbstractC9113b.m21905a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(strM20456a) && strM20456a.contains(",")) {
            strM20456a = strM20456a.split(",")[0];
        }
        map.put("ldomain", strM20456a);
        map.put("lbundle", iAConfigManager.f17691w.m20456a(AbstractC9113b.m21905a(str), "LAST_APP_BUNDLE_ID"));
        String strM20456a2 = iAConfigManager.f17691w.m20456a(AbstractC9113b.m21905a(str), "LAST_CLICKED");
        if (TextUtils.equals(strM20456a2, "0")) {
            strM20456a2 = "";
        }
        map.put("lclick", strM20456a2);
        String strM20456a3 = iAConfigManager.f17691w.m20456a(AbstractC9113b.m21905a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(strM20456a3, "0")) {
            strM20456a3 = "";
        }
        map.put("v_lskip", strM20456a3);
        UnitDisplayType unitDisplayTypeM21905a = AbstractC9113b.m21905a(str);
        map.put("v_lclicktype", unitDisplayTypeM21905a.isFullscreenUnit() ? iAConfigManager.f17691w.m20456a(unitDisplayTypeM21905a, "LAST_VAST_CLICKED_TYPE") : "");
        map.put("sdur", String.valueOf(AbstractC9113b.m21909c()));
        map.put("userid", iAConfigManager.f17659C.f17735g);
        map.put("low_power_mode", m21921a(AbstractC9113b.m21920n()));
        map.put("dark_mode", m21921a(AbstractC9113b.m21914h()));
        map.put("d_api", AbstractC9113b.m21910d());
        map.put("media_muted", m21921a(AbstractC9113b.m21916j()));
        Integer numM21906a = AbstractC9113b.m21906a();
        map.put("asv", numM21906a != null ? String.valueOf(numM21906a) : "");
    }
}
