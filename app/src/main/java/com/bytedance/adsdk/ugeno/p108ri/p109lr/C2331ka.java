package com.bytedance.adsdk.ugeno.p108ri.p109lr;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.EnumC2326fi;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2331ka extends AbstractC2333ri {

    /* JADX INFO: renamed from: mj */
    private List<Keyframe> f6033mj;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.ka$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f6034ri;

        static {
            int[] iArr = new int[EnumC2326fi.values().length];
            f6034ri = iArr;
            try {
                iArr[EnumC2326fi.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6034ri[EnumC2326fi.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C2331ka(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, Map<Float, String> map) {
        super(context, abstractViewOnTouchListenerC2318ik, str, map);
        this.f6033mj = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: di */
    public TypeEvaluator mo7990di() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: fi */
    public List<PropertyValuesHolder> mo7993fi() {
        String strM7961lr = this.f6039ka.m7961lr();
        m7995ka();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strM7961lr + "X", (Keyframe[]) this.f6037fi.toArray(new Keyframe[0]));
        this.f6036di.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strM7961lr + "Y", (Keyframe[]) this.f6033mj.toArray(new Keyframe[0]));
        this.f6036di.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorMo7990di = mo7990di();
        if (typeEvaluatorMo7990di != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorMo7990di);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorMo7990di);
        }
        return this.f6036di;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: lr */
    public void mo7991lr() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i = AnonymousClass1.f6034ri[this.f6039ka.ordinal()];
        if (i == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.xha.m7884vr());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.xha.slm());
        } else if (i != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.xha.m7832bu());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.xha.m7855nr());
        }
        if (keyframeOfFloat != null) {
            this.f6037fi.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.f6033mj.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: ri */
    public void mo7992ri(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.f6039ka == EnumC2326fi.TRANSLATE) {
                fOptDouble = C2347mj.m8043ri(this.f6041ri, fOptDouble);
                fOptDouble2 = C2347mj.m8043ri(this.f6041ri, fOptDouble2);
            }
            this.f6037fi.add(Keyframe.ofFloat(f, fOptDouble));
            this.f6033mj.add(Keyframe.ofFloat(f, fOptDouble2));
        } catch (JSONException unused) {
        }
    }
}
