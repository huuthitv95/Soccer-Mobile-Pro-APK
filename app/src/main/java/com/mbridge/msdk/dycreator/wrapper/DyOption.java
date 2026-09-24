package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DyOption {

    /* JADX INFO: renamed from: a */
    private List<String> f35404a;

    /* JADX INFO: renamed from: b */
    private File f35405b;

    /* JADX INFO: renamed from: c */
    private CampaignEx f35406c;

    /* JADX INFO: renamed from: d */
    private DyAdType f35407d;

    /* JADX INFO: renamed from: e */
    private String f35408e;

    /* JADX INFO: renamed from: f */
    private boolean f35409f;

    /* JADX INFO: renamed from: g */
    private boolean f35410g;

    /* JADX INFO: renamed from: h */
    private boolean f35411h;

    /* JADX INFO: renamed from: i */
    private boolean f35412i;

    /* JADX INFO: renamed from: j */
    private boolean f35413j;

    /* JADX INFO: renamed from: k */
    private boolean f35414k;

    /* JADX INFO: renamed from: l */
    private int f35415l;

    /* JADX INFO: renamed from: m */
    private int f35416m;

    /* JADX INFO: renamed from: n */
    private int f35417n;

    /* JADX INFO: renamed from: o */
    private int f35418o;

    /* JADX INFO: renamed from: p */
    private int f35419p;

    /* JADX INFO: renamed from: q */
    private int f35420q;

    /* JADX INFO: renamed from: r */
    private DyCountDownListenerWrapper f35421r;

    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a */
        private List<String> f35422a;

        /* JADX INFO: renamed from: b */
        private File f35423b;

        /* JADX INFO: renamed from: c */
        private CampaignEx f35424c;

        /* JADX INFO: renamed from: d */
        private DyAdType f35425d;

        /* JADX INFO: renamed from: e */
        private boolean f35426e;

        /* JADX INFO: renamed from: f */
        private String f35427f;

        /* JADX INFO: renamed from: g */
        private boolean f35428g;

        /* JADX INFO: renamed from: h */
        private boolean f35429h;

        /* JADX INFO: renamed from: i */
        private boolean f35430i;

        /* JADX INFO: renamed from: j */
        private boolean f35431j;

        /* JADX INFO: renamed from: k */
        private boolean f35432k;

        /* JADX INFO: renamed from: l */
        private int f35433l;

        /* JADX INFO: renamed from: m */
        private int f35434m;

        /* JADX INFO: renamed from: n */
        private int f35435n;

        /* JADX INFO: renamed from: o */
        private int f35436o;

        /* JADX INFO: renamed from: p */
        private int f35437p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f35427f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f35424c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z) {
            this.f35426e = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i) {
            this.f35436o = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f35425d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f35423b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f35422a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z) {
            this.f35431j = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z) {
            this.f35429h = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z) {
            this.f35432k = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z) {
            this.f35428g = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z) {
            this.f35430i = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i) {
            this.f35435n = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i) {
            this.f35433l = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i) {
            this.f35434m = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i) {
            this.f35437p = i;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z);

        IViewOptionBuilder countDownTime(int i);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z);

        IViewOptionBuilder isClickButtonVisible(boolean z);

        IViewOptionBuilder isLogoVisible(boolean z);

        IViewOptionBuilder isScreenClick(boolean z);

        IViewOptionBuilder isShakeVisible(boolean z);

        IViewOptionBuilder orientation(int i);

        IViewOptionBuilder shakeStrenght(int i);

        IViewOptionBuilder shakeTime(int i);

        IViewOptionBuilder templateType(int i);
    }

    public DyOption(Builder builder) {
        this.f35404a = builder.f35422a;
        this.f35405b = builder.f35423b;
        this.f35406c = builder.f35424c;
        this.f35407d = builder.f35425d;
        this.f35410g = builder.f35426e;
        this.f35408e = builder.f35427f;
        this.f35409f = builder.f35428g;
        this.f35411h = builder.f35429h;
        this.f35413j = builder.f35431j;
        this.f35412i = builder.f35430i;
        this.f35414k = builder.f35432k;
        this.f35415l = builder.f35433l;
        this.f35416m = builder.f35434m;
        this.f35417n = builder.f35435n;
        this.f35418o = builder.f35436o;
        this.f35420q = builder.f35437p;
    }

    public String getAdChoiceLink() {
        return this.f35408e;
    }

    public CampaignEx getCampaignEx() {
        return this.f35406c;
    }

    public int getCountDownTime() {
        return this.f35418o;
    }

    public int getCurrentCountDown() {
        return this.f35419p;
    }

    public DyAdType getDyAdType() {
        return this.f35407d;
    }

    public File getFile() {
        return this.f35405b;
    }

    public List<String> getFileDirs() {
        return this.f35404a;
    }

    public int getOrientation() {
        return this.f35417n;
    }

    public int getShakeStrenght() {
        return this.f35415l;
    }

    public int getShakeTime() {
        return this.f35416m;
    }

    public int getTemplateType() {
        return this.f35420q;
    }

    public boolean isApkInfoVisible() {
        return this.f35413j;
    }

    public boolean isCanSkip() {
        return this.f35410g;
    }

    public boolean isClickButtonVisible() {
        return this.f35411h;
    }

    public boolean isClickScreen() {
        return this.f35409f;
    }

    public boolean isLogoVisible() {
        return this.f35414k;
    }

    public boolean isShakeVisible() {
        return this.f35412i;
    }

    public void setDyCountDownListener(int i) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f35421r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i);
        }
        this.f35419p = i;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f35421r = dyCountDownListenerWrapper;
    }
}
