package com.bytedance.adsdk.ugeno.p108ri.p109lr;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.EnumC2326fi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2333ri {

    /* JADX INFO: renamed from: di */
    protected List<PropertyValuesHolder> f6036di = new ArrayList();

    /* JADX INFO: renamed from: fi */
    protected List<Keyframe> f6037fi = new ArrayList();

    /* JADX INFO: renamed from: ik */
    protected Map<Float, String> f6038ik;

    /* JADX INFO: renamed from: ka */
    protected EnumC2326fi f6039ka;

    /* JADX INFO: renamed from: lr */
    protected String f6040lr;

    /* JADX INFO: renamed from: ri */
    protected Context f6041ri;
    protected AbstractViewOnTouchListenerC2318ik xha;

    public AbstractC2333ri(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, Map<Float, String> map) {
        this.f6041ri = context;
        this.f6040lr = str;
        this.f6038ik = map;
        this.f6039ka = EnumC2326fi.m7959ri(this.f6040lr);
        this.xha = abstractViewOnTouchListenerC2318ik;
    }

    /* JADX INFO: renamed from: di */
    public abstract TypeEvaluator mo7990di();

    /* JADX INFO: renamed from: fi */
    public List<PropertyValuesHolder> mo7993fi() {
        String strM7961lr = this.f6039ka.m7961lr();
        m7995ka();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strM7961lr, (Keyframe[]) this.f6037fi.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorMo7990di = mo7990di();
        if (typeEvaluatorMo7990di != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorMo7990di);
        }
        this.f6036di.add(propertyValuesHolderOfKeyframe);
        return this.f6036di;
    }

    /* JADX INFO: renamed from: ik */
    public void m7994ik() {
        Map<Float, String> map = this.f6038ik;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.f6038ik;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                mo7992ri(100.0f, this.f6038ik.get(f));
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m7995ka() {
        Map<Float, String> map = this.f6038ik;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!m7996ri()) {
            mo7991lr();
        }
        for (Map.Entry<Float, String> entry : this.f6038ik.entrySet()) {
            if (entry != null) {
                mo7992ri(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        m7994ik();
    }

    /* JADX INFO: renamed from: lr */
    public abstract void mo7991lr();

    /* JADX INFO: renamed from: ri */
    public abstract void mo7992ri(float f, String str);

    /* JADX INFO: renamed from: ri */
    public boolean m7996ri() {
        Map<Float, String> map = this.f6038ik;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.f6038ik.containsKey(Float.valueOf(0.0f));
    }
}
