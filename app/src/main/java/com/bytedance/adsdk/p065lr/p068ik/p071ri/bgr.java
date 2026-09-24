package com.bytedance.adsdk.p065lr.p068ik.p071ri;

import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class bgr<V, O> implements InterfaceC2088aw<V, O> {

    /* JADX INFO: renamed from: ri */
    final List<C2167ri<V>> f5035ri;

    bgr(List<C2167ri<V>> list) {
        this.f5035ri = list;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: ik */
    public List<C2167ri<V>> mo6901ik() {
        return this.f5035ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw
    /* JADX INFO: renamed from: lr */
    public boolean mo6902lr() {
        return this.f5035ri.isEmpty() || (this.f5035ri.size() == 1 && this.f5035ri.get(0).m7207fi());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f5035ri.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f5035ri.toArray()));
        }
        return sb.toString();
    }
}
