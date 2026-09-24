package androidx.media3.exoplayer.drm;

import android.media.AudioProfile;
import android.media.AudioRouting;
import android.media.MediaCodecInfo;
import android.media.MediaDrm;
import android.media.MediaParser;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AudioProfile m426m(Object obj) {
        return (AudioProfile) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AudioRouting.OnRoutingChangedListener m427m(Object obj) {
        return (AudioRouting.OnRoutingChangedListener) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m429m(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m430m(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m432m(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m433m(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m435m(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ NetworkEvent.Builder m436m() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PlaybackErrorEvent.Builder m440m() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PlaybackMetrics.Builder m445m() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m449m(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PlaybackStateEvent.Builder m452m() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ TrackChangeEvent.Builder m456m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m469m() {
    }

    public static /* synthetic */ void m$1() {
    }
}
