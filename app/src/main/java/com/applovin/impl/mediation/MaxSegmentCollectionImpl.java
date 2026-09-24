package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* JADX INFO: renamed from: a */
    private final List f2113a;

    /* JADX INFO: renamed from: b */
    private final Map f2114b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* JADX INFO: renamed from: a */
        private final List f2115a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f2115a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f2115a;
        this.f2113a = list;
        this.f2114b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f2114b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f2114b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f2113a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f2113a + "}";
    }
}
