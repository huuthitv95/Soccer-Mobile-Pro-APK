package com.mbridge.msdk.out;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class NativeListener {

    public interface FilpListener {
        void filpEvent(int i);
    }

    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i);

        void onLoggingImpression(int i);
    }

    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    public static class Template {
        private int adNum;

        /* JADX INFO: renamed from: id */
        private int f37394id;

        public Template(int i, int i2) {
            this.f37394id = i;
            this.adNum = i2;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.f37394id;
        }

        public void setAdNum(int i) {
            this.adNum = i;
        }

        public void setId(int i) {
            this.f37394id = i;
        }
    }

    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
