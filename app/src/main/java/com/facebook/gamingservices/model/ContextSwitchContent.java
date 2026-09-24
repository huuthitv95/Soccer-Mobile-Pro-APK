package com.facebook.gamingservices.model;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ContextSwitchContent implements ShareModel {
    private final String contextID;

    public static class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {
        private String contextID;

        @Override // com.facebook.share.ShareBuilder
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this);
        }

        Builder readFrom(Parcel parcel) {
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextSwitchContent contextSwitchContent) {
            return contextSwitchContent == null ? this : setContextID(contextSwitchContent.getContextID());
        }

        public Builder setContextID(String str) {
            this.contextID = str;
            return this;
        }
    }

    ContextSwitchContent(Parcel parcel) {
        this.contextID = parcel.readString();
    }

    private ContextSwitchContent(Builder builder) {
        this.contextID = builder.contextID;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContextID() {
        return this.contextID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contextID);
    }
}
