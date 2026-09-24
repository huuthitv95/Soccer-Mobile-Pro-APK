package com.applovin.impl.mediation;

import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAdViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a */
    private final MaxAdViewConfiguration.AdaptiveType f2075a;

    /* JADX INFO: renamed from: b */
    private final int f2076b;

    /* JADX INFO: renamed from: c */
    private final int f2077c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a */
        private MaxAdViewConfiguration.AdaptiveType f2078a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b */
        private int f2079b = -1;

        /* JADX INFO: renamed from: c */
        private int f2080c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f2078a;
        }

        public int getAdaptiveWidth() {
            return this.f2079b;
        }

        public int getInlineMaximumHeight() {
            return this.f2080c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            C1768p.m5165e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f2078a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            C1768p.m5165e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.f2079b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            C1768p.m5165e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.f2080c = i;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f2078a + ", adaptiveWidth=" + this.f2079b + ", inlineMaximumHeight=" + this.f2080c + "}";
        }
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f2075a = builderImpl.f2078a;
        this.f2076b = builderImpl.f2079b;
        this.f2077c = builderImpl.f2080c;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f2075a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f2076b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f2077c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f2075a + ", adaptiveWidth=" + this.f2076b + ", inlineMaximumHeight=" + this.f2077c + "}";
    }
}
