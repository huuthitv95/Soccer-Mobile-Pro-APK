package com.vungle.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleCSBData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eBO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m43475d2 = {"Lcom/vungle/ads/VungleCSBData;", "Ljava/io/Serializable;", "bidFloor", "", "auctionId", "", "creativeId", "adUnitId", TypedValues.CycleType.S_WAVE_PHASE, "", "isVXWinner", "", "extras", "", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Map;)V", "getAdUnitId", "()Ljava/lang/String;", "getAuctionId", "getBidFloor", "()D", "getCreativeId", "getExtras", "()Ljava/util/Map;", "()Z", "getPhase", "()I", "equals", "other", "", "hashCode", "Builder", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class VungleCSBData implements Serializable {
    private final String adUnitId;
    private final String auctionId;
    private final double bidFloor;
    private final String creativeId;
    private final Map<String, String> extras;
    private final boolean isVXWinner;
    private final int phase;

    /* JADX INFO: compiled from: VungleCSBData.kt */
    @Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u0010\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m43475d2 = {"Lcom/vungle/ads/VungleCSBData$Builder;", "", "bidFloor", "", "(D)V", "adUnitId", "", "auctionId", "creativeId", "extras", "", "isPriorityAccess", "", "isVXWinner", "build", "Lcom/vungle/ads/VungleCSBData;", "putExtras", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class Builder {
        private String adUnitId;
        private String auctionId;
        private final double bidFloor;
        private String creativeId;
        private Map<String, String> extras;
        private boolean isPriorityAccess;
        private boolean isVXWinner;

        public Builder(double d) {
            this.bidFloor = d;
        }

        public final Builder adUnitId(String adUnitId) {
            this.adUnitId = adUnitId;
            return this;
        }

        public final Builder auctionId(String auctionId) {
            this.auctionId = auctionId;
            return this;
        }

        public final VungleCSBData build() {
            double d = this.bidFloor;
            String str = this.auctionId;
            if (str == null) {
                str = "";
            }
            String str2 = this.creativeId;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.adUnitId;
            return new VungleCSBData(d, str, str2, str3 != null ? str3 : "", this.isPriorityAccess ? 2 : 1, this.isVXWinner, this.extras, null);
        }

        public final Builder creativeId(String creativeId) {
            this.creativeId = creativeId;
            return this;
        }

        public final Builder isPriorityAccess(boolean isPriorityAccess) {
            this.isPriorityAccess = isPriorityAccess;
            return this;
        }

        public final Builder isVXWinner(boolean isVXWinner) {
            this.isVXWinner = isVXWinner;
            return this;
        }

        public final Builder putExtras(Map<String, String> extras) {
            this.extras = extras;
            return this;
        }
    }

    private VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map<String, String> map) {
        this.bidFloor = d;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i;
        this.isVXWinner = z;
        this.extras = map;
    }

    /* synthetic */ VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, (i2 & 64) != 0 ? null : map);
    }

    public /* synthetic */ VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VungleCSBData)) {
            return false;
        }
        VungleCSBData vungleCSBData = (VungleCSBData) other;
        return Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && Intrinsics.areEqual(this.auctionId, vungleCSBData.auctionId) && Intrinsics.areEqual(this.creativeId, vungleCSBData.creativeId) && Intrinsics.areEqual(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && Intrinsics.areEqual(this.extras, vungleCSBData.extras);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iM43483m = ((((((((((UByte$$ExternalSyntheticBackport0.m43483m(this.bidFloor) * 31) + this.auctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31) + this.phase) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.isVXWinner)) * 31;
        Map<String, String> map = this.extras;
        return iM43483m + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isVXWinner, reason: from getter */
    public final boolean getIsVXWinner() {
        return this.isVXWinner;
    }
}
