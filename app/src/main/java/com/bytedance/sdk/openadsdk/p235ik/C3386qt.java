package com.bytedance.sdk.openadsdk.p235ik;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3386qt {

    /* JADX INFO: renamed from: aw */
    private JSONObject f12043aw;
    private wjv bgr;

    /* JADX INFO: renamed from: bu */
    private FilterWord f12044bu;

    /* JADX INFO: renamed from: co */
    private String f12045co;

    /* JADX INFO: renamed from: qt */
    private String f12048qt;

    /* JADX INFO: renamed from: sf */
    private String f12049sf;
    private int slm;

    /* JADX INFO: renamed from: vr */
    private int f12050vr;

    /* JADX INFO: renamed from: ri */
    public static FilterWord f12042ri = new FilterWord("", "");

    /* JADX INFO: renamed from: lr */
    public static int f12041lr = 1;

    /* JADX INFO: renamed from: ik */
    public static int f12039ik = 2;

    /* JADX INFO: renamed from: ka */
    public static int f12040ka = 3;

    /* JADX INFO: renamed from: fi */
    public static int f12038fi = 4;

    /* JADX INFO: renamed from: di */
    private final Set<ik> f12046di = new HashSet();
    private final Set<lr> xha = new HashSet();

    /* JADX INFO: renamed from: mj */
    private final Set<ka> f12047mj = new HashSet();
    private final Set<ri> jbs = new HashSet();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.qt$ik */
    public interface ik {
        /* JADX INFO: renamed from: ri */
        void mo15282ri(FilterWord filterWord);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.qt$ka */
    public interface ka {
        /* JADX INFO: renamed from: ri */
        void mo15303ri(String str);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.qt$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo11275ri(int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.qt$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo15304ri(List<FilterWord> list);
    }

    /* JADX INFO: renamed from: qt */
    private void m15317qt() {
        Iterator<ik> it = this.f12046di.iterator();
        while (it.hasNext()) {
            it.next().mo15282ri(this.f12044bu);
        }
    }

    /* JADX INFO: renamed from: di */
    public void m15318di() {
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().mo11275ri(f12038fi);
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m15319fi() {
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().mo11275ri(f12039ik);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m15320ik(String str) {
        this.f12045co = str;
        Iterator<ka> it = this.f12047mj.iterator();
        while (it.hasNext()) {
            it.next().mo15303ri(this.f12045co);
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m15321ik() {
        FilterWord filterWord = this.f12044bu;
        return (filterWord == null || filterWord.equals(f12042ri)) ? false : true;
    }

    public boolean jbs() {
        return this.f12050vr < this.slm;
    }

    /* JADX INFO: renamed from: ka */
    public void m15322ka() {
        wjv wjvVar;
        if (!m15321ik() && !TextUtils.isEmpty(this.f12045co)) {
            this.f12044bu = new FilterWord("0:00", this.f12045co);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f12044bu);
        if (!TextUtils.isEmpty(this.f12048qt)) {
            if (TextUtils.isEmpty(this.f12045co)) {
                C3384lr.m15309ri().m15310ri(this.f12048qt, arrayList, this.f12049sf);
            } else {
                if (this.f12043aw == null && (wjvVar = this.bgr) != null) {
                    this.f12043aw = wjvVar.m14361aw(true);
                }
                C3384lr.m15309ri().m15311ri(this.f12048qt, arrayList, this.f12043aw, this.f12045co, this.f12049sf);
            }
        }
        Iterator<lr> it = this.xha.iterator();
        while (it.hasNext()) {
            it.next().mo11275ri(f12041lr);
        }
        m15328ri(f12042ri);
        m15320ik("");
    }

    /* JADX INFO: renamed from: lr */
    public FilterWord m15323lr() {
        return this.f12044bu;
    }

    /* JADX INFO: renamed from: lr */
    public void m15324lr(String str) {
        this.f12049sf = str;
    }

    /* JADX INFO: renamed from: mj */
    public int m15325mj() {
        return this.f12050vr;
    }

    /* JADX INFO: renamed from: ri */
    public void m15326ri() {
        this.f12046di.clear();
        this.xha.clear();
        this.f12047mj.clear();
        this.jbs.clear();
    }

    /* JADX INFO: renamed from: ri */
    public void m15327ri(int i, int i2) {
        this.f12050vr = i;
        this.slm = i2;
    }

    /* JADX INFO: renamed from: ri */
    public void m15328ri(FilterWord filterWord) {
        this.f12044bu = filterWord;
        m15317qt();
    }

    /* JADX INFO: renamed from: ri */
    public void m15329ri(wjv wjvVar) {
        this.bgr = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m15330ri(ik ikVar) {
        this.f12046di.add(ikVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m15331ri(ka kaVar) {
        this.f12047mj.add(kaVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m15332ri(lr lrVar) {
        this.xha.add(lrVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m15333ri(ri riVar) {
        this.jbs.add(riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m15334ri(String str) {
        this.f12048qt = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m15335ri(List<FilterWord> list) {
        Iterator<ri> it = this.jbs.iterator();
        while (it.hasNext()) {
            it.next().mo15304ri(list);
        }
    }

    public String xha() {
        return this.f12045co;
    }
}
