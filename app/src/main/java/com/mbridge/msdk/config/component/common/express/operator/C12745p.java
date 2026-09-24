package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.p */
/* JADX INFO: compiled from: OperatorSharePreferences.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12745p {

    /* JADX INFO: renamed from: a */
    private final C12748c f33906a;

    public C12745p(C12748c c12748c) {
        this.f33906a = c12748c;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public C12746a m35015a(String str, Object obj, List<Object> list) {
        String strValueOf;
        int iIntValue;
        byte b;
        byte b2;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return C12746a.m35017c();
        }
        if (!str.equals(C12770c.m35209b("879"))) {
            return C12746a.m35017c();
        }
        Object objValueOf = "";
        String string = list.get(0) != null ? list.get(0).toString() : "";
        if (list.size() >= 2) {
            Object obj2 = list.get(1);
            if (obj2 instanceof Integer) {
                iIntValue = ((Integer) obj2).intValue();
            } else if (obj2 != null) {
                try {
                    iIntValue = Integer.parseInt(obj2.toString());
                } catch (NumberFormatException unused) {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 1;
            }
            if (list.size() == 3) {
                Object obj3 = list.get(2);
                if (obj3 instanceof String) {
                    strValueOf = String.valueOf(obj3);
                } else {
                    strValueOf = "STRING";
                }
            } else {
                strValueOf = "STRING";
            }
        } else {
            strValueOf = "STRING";
            iIntValue = 1;
        }
        if (TextUtils.isEmpty(string)) {
            return C12746a.m35016a(null);
        }
        if (iIntValue == 1) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13008c.m36588n().m36542d());
                switch (strValueOf.hashCode()) {
                    case -1838656495:
                        if (!strValueOf.equals("STRING")) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 72655:
                        if (!strValueOf.equals("INT")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 2342524:
                        if (!strValueOf.equals("LONG")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 66988604:
                        if (!strValueOf.equals("FLOAT")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 782694408:
                        if (!strValueOf.equals("BOOLEAN")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    objValueOf = Integer.valueOf(defaultSharedPreferences.getInt(string, 0));
                } else if (b == 1) {
                    objValueOf = Long.valueOf(defaultSharedPreferences.getLong(string, 0L));
                } else if (b != 2) {
                    objValueOf = b != 3 ? defaultSharedPreferences.getString(string, "") : Boolean.valueOf(defaultSharedPreferences.getBoolean(string, false));
                } else {
                    objValueOf = Float.valueOf(defaultSharedPreferences.getFloat(string, 0.0f));
                }
            } catch (Exception unused2) {
            }
        } else {
            switch (strValueOf) {
                case "STRING":
                    b2 = 4;
                    break;
                case "INT":
                    b2 = 0;
                    break;
                case "LONG":
                    b2 = 1;
                    break;
                case "FLOAT":
                    b2 = 2;
                    break;
                case "BOOLEAN":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                objValueOf = Integer.valueOf(C12769b.m35186a(C13008c.m36588n().m36542d()).m35190a(string, 0));
            } else if (b2 == 1) {
                objValueOf = Long.valueOf(C12769b.m35186a(C13008c.m36588n().m36542d()).m35191a(string, 0L));
            } else if (b2 != 2) {
                objValueOf = b2 != 3 ? C12769b.m35186a(C13008c.m36588n().m36542d()).m35192a(string, "") : Boolean.valueOf(C12769b.m35186a(C13008c.m36588n().m36542d()).m35193a(string, false));
            } else {
                objValueOf = Float.valueOf(C12769b.m35186a(C13008c.m36588n().m36542d()).m35189a(string, 0.0f));
            }
        }
        return C12746a.m35016a(objValueOf);
    }
}
