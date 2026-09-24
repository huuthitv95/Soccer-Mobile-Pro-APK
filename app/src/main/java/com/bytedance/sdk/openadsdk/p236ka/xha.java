package com.bytedance.sdk.openadsdk.p236ka;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: fi */
    private long f12538fi;

    /* JADX INFO: renamed from: ik */
    private long f12539ik;

    /* JADX INFO: renamed from: ka */
    private long f12540ka;

    /* JADX INFO: renamed from: lr */
    private long f12541lr;

    /* JADX INFO: renamed from: ri */
    private long f12542ri;

    /* JADX INFO: renamed from: fi */
    public void m15717fi(long j) {
        if (this.f12538fi <= 0) {
            this.f12538fi = j;
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m15718ik(long j) {
        if (this.f12539ik <= 0) {
            this.f12539ik = j;
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m15719ka(long j) {
        if (this.f12540ka <= 0) {
            this.f12540ka = j;
        }
    }

    /* JADX INFO: renamed from: lr */
    public JSONObject m15720lr() {
        return m15722ri((JSONObject) null);
    }

    /* JADX INFO: renamed from: lr */
    public void m15721lr(long j) {
        if (this.f12541lr <= 0) {
            this.f12541lr = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX INFO: renamed from: ri */
    public JSONObject m15722ri(JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j = this.f12542ri;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.f12541lr;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.f12539ik;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.f12540ka;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.f12538fi;
                                if (j5 > 0) {
                                    jSONObject.put("show_full", j5);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j = this.f12542ri;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.f12541lr;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.f12539ik;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.f12540ka;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.f12538fi;
                            if (j5 > 0) {
                                jSONObject.put("show_full", j5);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public void m15723ri(long j) {
        if (this.f12542ri <= 0) {
            this.f12542ri = j;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15724ri(long j, float f) {
        if (f > 0.0f) {
            m15723ri(j);
        }
        double d = f;
        if (d >= 0.25d) {
            m15723ri(j);
            m15721lr(j);
        }
        if (d >= 0.5d) {
            m15723ri(j);
            m15721lr(j);
            m15718ik(j);
        }
        if (d >= 0.75d) {
            m15723ri(j);
            m15721lr(j);
            m15718ik(j);
            m15719ka(j);
        }
        if (f >= 1.0f) {
            m15723ri(j);
            m15721lr(j);
            m15718ik(j);
            m15719ka(j);
            m15717fi(j);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m15725ri() {
        return this.f12542ri > 0;
    }
}
