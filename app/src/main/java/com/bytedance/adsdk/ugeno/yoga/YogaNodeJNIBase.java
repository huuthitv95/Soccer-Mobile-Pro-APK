package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YogaNodeJNIBase extends AbstractC2360qt implements Cloneable {
    private float[] arr;

    /* JADX INFO: renamed from: di */
    private Object f6112di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2355lr f6113fi;

    /* JADX INFO: renamed from: ik */
    private List<YogaNodeJNIBase> f6114ik;

    /* JADX INFO: renamed from: ka */
    private xha f6115ka;

    /* JADX INFO: renamed from: lr */
    private YogaNodeJNIBase f6116lr;
    private int mLayoutDirection;

    /* JADX INFO: renamed from: ri */
    protected long f6117ri;
    private boolean xha;

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.xha = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f6117ri = j;
    }

    /* JADX INFO: renamed from: lr */
    private void m8058lr(AbstractC2360qt abstractC2360qt) {
        mo8080qt();
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f6114ik;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.f6114ik.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.f6116lr = this;
        return yogaNodeJNIBase.f6117ri;
    }

    public final float baseline(float f, float f2) {
        return this.f6113fi.m8123ri(this, f, f2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: co */
    public void mo8059co(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f6117ri, f);
    }

    /* JADX INFO: renamed from: co */
    public boolean m8060co() {
        return this.f6115ka != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: di */
    public float mo8061di() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: di */
    public void mo8062di(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: fi */
    public void mo8063fi() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f6117ri);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: fi */
    public void mo8064fi(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase mo8084ri(int i) {
        List<YogaNodeJNIBase> list = this.f6114ik;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ik */
    public void mo8066ik() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f6117ri);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ik */
    public void mo8067ik(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ik */
    public void mo8068ik(EnumC2354ka enumC2354ka, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f6117ri, enumC2354ka.m8122ri(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ik */
    public void mo8069ik(EnumC2361ri enumC2361ri) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f6117ri, enumC2361ri.m8176ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    public float jbs() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    public void jbs(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase mo8074lr(int i) {
        List<YogaNodeJNIBase> list = this.f6114ik;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i);
        yogaNodeJNIBaseRemove.f6116lr = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f6117ri, yogaNodeJNIBaseRemove.f6117ri);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ka */
    public void mo8071ka() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f6117ri);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ka */
    public void mo8072ka(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: lr */
    public void mo8075lr(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: lr */
    public void mo8076lr(EnumC2354ka enumC2354ka, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f6117ri, enumC2354ka.m8122ri(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: lr */
    public void mo8077lr(EnumC2361ri enumC2361ri) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f6117ri, enumC2361ri.m8176ri());
    }

    public final long measure(float f, int i, float f2, int i2) {
        if (m8060co()) {
            return this.f6115ka.mo8135ri(this, f, EnumC2359mj.m8171ri(i), f2, EnumC2359mj.m8171ri(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: mj */
    public float mo8078mj() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: mj */
    public void mo8079mj(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: qt */
    public Object mo8080qt() {
        return this.f6112di;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: qt */
    public void mo8081qt(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public int mo8082ri() {
        List<YogaNodeJNIBase> list = this.f6114ik;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public int mo8083ri(AbstractC2360qt abstractC2360qt) {
        List<YogaNodeJNIBase> list = this.f6114ik;
        if (list == null) {
            return -1;
        }
        return list.indexOf(abstractC2360qt);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8085ri(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8086ri(float f, float f2) {
        m8058lr((AbstractC2360qt) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f6114ik;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m8058lr(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f6117ri;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f6117ri, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8087ri(EnumC2349aw enumC2349aw) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f6117ri, enumC2349aw.m8103ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8088ri(bgr bgrVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f6117ri, bgrVar.m8107ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8089ri(EnumC2351di enumC2351di) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f6117ri, enumC2351di.m8112ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8090ri(EnumC2352fi enumC2352fi) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f6117ri, enumC2352fi.m8116ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8091ri(EnumC2353ik enumC2353ik) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f6117ri, enumC2353ik.m8118ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8092ri(EnumC2354ka enumC2354ka, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f6117ri, enumC2354ka.m8122ri(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8093ri(AbstractC2360qt abstractC2360qt, int i) {
        if (abstractC2360qt instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC2360qt;
            if (yogaNodeJNIBase.f6116lr != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f6114ik == null) {
                this.f6114ik = new ArrayList(4);
            }
            this.f6114ik.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f6116lr = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f6117ri, yogaNodeJNIBase.f6117ri, i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8094ri(EnumC2361ri enumC2361ri) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f6117ri, enumC2361ri.m8176ri());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8095ri(xha xhaVar) {
        this.f6115ka = xhaVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f6117ri, xhaVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8096ri(Object obj) {
        this.f6112di = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: ri */
    public void mo8097ri(boolean z) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.f6117ri, z);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: sf, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase mo8073lr() {
        return this.f6116lr;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    /* JADX INFO: renamed from: sf */
    public void mo8099sf(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f6117ri, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    public float xha() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt
    public void xha(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f6117ri, f);
    }
}
