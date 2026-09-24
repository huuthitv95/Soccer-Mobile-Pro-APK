package com.fyber.inneractive.sdk.external;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ImpressionData {

    /* JADX INFO: renamed from: a */
    public Pricing f17895a = new Pricing();

    /* JADX INFO: renamed from: b */
    public Video f17896b;

    /* JADX INFO: renamed from: c */
    public String f17897c;

    /* JADX INFO: renamed from: d */
    public Long f17898d;

    /* JADX INFO: renamed from: e */
    public String f17899e;

    /* JADX INFO: renamed from: f */
    public String f17900f;

    /* JADX INFO: renamed from: g */
    public String f17901g;

    /* JADX INFO: renamed from: h */
    public String f17902h;

    /* JADX INFO: renamed from: i */
    public String f17903i;

    public static class Pricing {

        /* JADX INFO: renamed from: a */
        public double f17904a;

        /* JADX INFO: renamed from: b */
        public String f17905b;

        public String getCurrency() {
            return this.f17905b;
        }

        public double getValue() {
            return this.f17904a;
        }

        public void setValue(double d) {
            this.f17904a = d;
        }

        public String toString() {
            return "Pricing{value=" + this.f17904a + ", currency='" + this.f17905b + "'}";
        }
    }

    public static class Video {

        /* JADX INFO: renamed from: a */
        public final boolean f17906a;

        /* JADX INFO: renamed from: b */
        public long f17907b;

        public Video(boolean z, long j) {
            this.f17906a = z;
            this.f17907b = j;
        }

        public long getDuration() {
            return this.f17907b;
        }

        public boolean isSkippable() {
            return this.f17906a;
        }

        public String toString() {
            return "Video{skippable=" + this.f17906a + ", duration=" + this.f17907b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public String getAdvertiserDomain() {
        return this.f17903i;
    }

    public String getCampaignId() {
        return this.f17902h;
    }

    public String getCountry() {
        return this.f17899e;
    }

    public String getCreativeId() {
        return this.f17901g;
    }

    public Long getDemandId() {
        return this.f17898d;
    }

    public String getDemandSource() {
        return this.f17897c;
    }

    public String getImpressionId() {
        return this.f17900f;
    }

    public Pricing getPricing() {
        return this.f17895a;
    }

    public Video getVideo() {
        return this.f17896b;
    }

    public void setAdvertiserDomain(String str) {
        this.f17903i = str;
    }

    public void setCampaignId(String str) {
        this.f17902h = str;
    }

    public void setCountry(String str) {
        this.f17899e = str;
    }

    public void setCpmValue(String str) {
        double d;
        try {
            d = Double.parseDouble(str);
        } catch (Exception unused) {
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        this.f17895a.f17904a = d;
    }

    public void setCreativeId(String str) {
        this.f17901g = str;
    }

    public void setCurrency(String str) {
        this.f17895a.f17905b = str;
    }

    public void setDemandId(Long l) {
        this.f17898d = l;
    }

    public void setDemandSource(String str) {
        this.f17897c = str;
    }

    public void setDuration(long j) {
        this.f17896b.f17907b = j;
    }

    public void setImpressionId(String str) {
        this.f17900f = str;
    }

    public void setPricing(Pricing pricing) {
        this.f17895a = pricing;
    }

    public void setVideo(Video video) {
        this.f17896b = video;
    }

    public String toString() {
        return "ImpressionData{pricing=" + this.f17895a + ", video=" + this.f17896b + ", demandSource='" + this.f17897c + "', country='" + this.f17899e + "', impressionId='" + this.f17900f + "', creativeId='" + this.f17901g + "', campaignId='" + this.f17902h + "', advertiserDomain='" + this.f17903i + "'}";
    }
}
