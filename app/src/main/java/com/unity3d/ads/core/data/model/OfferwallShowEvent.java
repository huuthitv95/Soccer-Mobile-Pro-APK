package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OfferwallShowEvent.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, m43475d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "", "()V", "Show", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public abstract class OfferwallShowEvent {

    /* JADX INFO: compiled from: OfferwallShowEvent.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Show extends OfferwallShowEvent {
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private OfferwallShowEvent() {
    }

    public /* synthetic */ OfferwallShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
