package com.bytedance.adsdk.ugeno.p108ri;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2327ik {

    /* JADX INFO: renamed from: di */
    private ri f6023di;

    /* JADX INFO: renamed from: fi */
    private long f6024fi;

    /* JADX INFO: renamed from: ik */
    private int f6025ik;
    private int jbs = 1;

    /* JADX INFO: renamed from: ka */
    private String f6026ka;

    /* JADX INFO: renamed from: lr */
    private long f6027lr;

    /* JADX INFO: renamed from: mj */
    private String f6028mj;

    /* JADX INFO: renamed from: qt */
    private JSONObject f6029qt;

    /* JADX INFO: renamed from: ri */
    private Map<String, TreeMap<Float, String>> f6030ri;
    private String xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ik$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        public String f6031lr;

        /* JADX INFO: renamed from: ri */
        public String f6032ri;
    }

    /* JADX INFO: renamed from: di */
    public long m7963di() {
        return this.f6024fi;
    }

    /* JADX INFO: renamed from: fi */
    public String m7964fi() {
        return this.f6026ka;
    }

    /* JADX INFO: renamed from: ik */
    public long m7965ik() {
        return this.f6027lr;
    }

    /* JADX INFO: renamed from: ik */
    public void m7966ik(String str) {
        this.f6028mj = str;
    }

    public String jbs() {
        return this.f6028mj;
    }

    /* JADX INFO: renamed from: ka */
    public int m7967ka() {
        return this.f6025ik;
    }

    /* JADX INFO: renamed from: lr */
    public Map<String, TreeMap<Float, String>> m7968lr() {
        return this.f6030ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m7969lr(int i) {
        this.jbs = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m7970lr(long j) {
        this.f6024fi = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m7971lr(String str) {
        this.xha = str;
    }

    /* JADX INFO: renamed from: mj */
    public String m7972mj() {
        return this.xha;
    }

    /* JADX INFO: renamed from: qt */
    public int m7973qt() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m7974ri() {
        return this.f6029qt;
    }

    /* JADX INFO: renamed from: ri */
    public void m7975ri(int i) {
        this.f6025ik = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m7976ri(long j) {
        this.f6027lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m7977ri(ri riVar) {
        this.f6023di = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m7978ri(String str) {
        this.f6026ka = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m7979ri(Map<String, TreeMap<Float, String>> map) {
        this.f6030ri = map;
    }

    /* JADX INFO: renamed from: ri */
    public void m7980ri(JSONObject jSONObject) {
        this.f6029qt = jSONObject;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.f6030ri + ", mDuration=" + this.f6027lr + ", mPlayCount=" + this.f6025ik + ", mPlayDirection=" + this.f6026ka + ", mDelay=" + this.f6024fi + ", mName=" + this.f6028mj + ", mPlayState=" + this.jbs + ", mTransformOrigin='" + this.f6023di + "', mTimingFunction='" + this.xha + "'}";
    }

    public ri xha() {
        return this.f6023di;
    }
}
