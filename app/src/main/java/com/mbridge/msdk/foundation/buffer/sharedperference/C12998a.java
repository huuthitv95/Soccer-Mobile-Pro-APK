package com.mbridge.msdk.foundation.buffer.sharedperference;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.FastKV;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.buffer.sharedperference.a */
/* JADX INFO: compiled from: SharedPerferenceManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C12998a {

    /* JADX INFO: renamed from: b */
    public static final String f35441b = "a";

    /* JADX INFO: renamed from: c */
    private static C12998a f35442c;

    /* JADX INFO: renamed from: a */
    FastKV f35443a;

    private C12998a() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C12998a m36460b() {
        if (f35442c == null) {
            f35442c = new C12998a();
        }
        return f35442c;
    }

    /* JADX INFO: renamed from: a */
    public String m36462a(String str) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                return null;
            }
            m36459a();
            FastKV fastKV = this.f35443a;
            if (fastKV != null) {
                try {
                    return fastKV.getString(str, "");
                } catch (Exception unused) {
                    return "";
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(f35441b, "get error: " + e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m36467c(String str) {
        if (C13008c.m36588n().m36542d() == null) {
            return;
        }
        m36459a();
        FastKV fastKV = this.f35443a;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Long m36465b(String str) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                C13219q0.m37816b(f35441b, "context is null in get");
                return 0L;
            }
            m36459a();
            FastKV fastKV = this.f35443a;
            if (fastKV != null) {
                try {
                    return Long.valueOf(fastKV.getLong(str, 0L));
                } catch (Exception unused) {
                    return 0L;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(f35441b, "getLong error: " + e.getMessage());
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public int m36461a(String str, int i) {
        try {
            if (C13008c.m36588n().m36542d() != null) {
                m36459a();
                FastKV fastKV = this.f35443a;
                if (fastKV != null) {
                    try {
                        return fastKV.getInt(str, i);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(f35441b, "getInt error: " + e.getMessage());
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public void m36466b(String str, int i) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                return;
            }
            m36459a();
            FastKV fastKV = this.f35443a;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36464a(String str, String str2) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                return;
            }
            m36459a();
            FastKV fastKV = this.f35443a;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(f35441b, "put error: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36463a(String str, long j) {
        try {
            if (C13008c.m36588n().m36542d() == null) {
                C13219q0.m37816b(f35441b, "context is null in put");
                return;
            }
            m36459a();
            FastKV fastKV = this.f35443a;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a(f35441b, "putLong error: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36459a() {
        if (this.f35443a == null) {
            try {
                this.f35443a = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f35443a = null;
            }
        }
    }
}
