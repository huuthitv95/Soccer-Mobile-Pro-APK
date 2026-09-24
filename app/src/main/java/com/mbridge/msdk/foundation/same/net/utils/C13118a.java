package com.mbridge.msdk.foundation.same.net.utils;

import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.a */
/* JADX INFO: compiled from: CommonHttpConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13118a {
    /* JADX INFO: renamed from: a */
    public static String m37208a(C13113a c13113a) {
        if (c13113a == null) {
            return "Network error,Load failed";
        }
        try {
            int i = c13113a.f35959a;
            C13117a c13117a = c13113a.f35961c;
            int i2 = c13117a != null ? c13117a.f35982d : 0;
            if (i == -2) {
                return "Network is canceled";
            }
            if (i == 15) {
                return "Network error,I/O exception contents null";
            }
            if (i == 880023) {
                return "timeout";
            }
            if (i == 880041) {
                return "Network error,UnknownHostException";
            }
            switch (i) {
                case 1:
                    return "Network error,Load failed";
                case 2:
                    return "Network error,I/O exception";
                case 3:
                    return "Network error,timeout exception";
                case 4:
                    return "Network unknown error";
                case 5:
                    return "Network error，https is not work,please check your phone time";
                case 6:
                    if (i2 == 0) {
                        return "Network error,please check ";
                    }
                    return "Network error,please check state code " + i2;
                case 7:
                    if (i2 == 0) {
                        return "The server returns an exception ";
                    }
                    return "The server returns an exception state code " + i2;
                case 8:
                    return "Cast exception, return data can not be casted correctly";
                default:
                    switch (i) {
                        case 10:
                            return "Network error,socket timeout exception";
                        case 11:
                            return "Network error，sslp exception";
                        case 12:
                            return "Network error,ConnectException";
                        case 13:
                            if (c13117a == null) {
                                return "Unknown socket exception";
                            }
                            byte[] bArr = c13117a.f35979a;
                            return bArr != null ? new String(bArr) : "Socket exception message is NULL";
                        default:
                            return "Network error,unknown";
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
