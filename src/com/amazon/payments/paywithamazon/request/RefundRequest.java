package com.amazon.payments.paywithamazon.request;

import com.amazon.payments.paywithamazon.types.CurrencyCode;
import com.amazon.payments.paywithamazon.response.autogenerated.model.ProviderCredit;
import java.io.Serializable;
import java.util.List;

/**
 * Container for the parameters to the {@link com.amazon.payments.lpa.Client#refund(RefundRequest) Refund operation}.
 * For more information documentation, see  
 * <a href="https://payments.amazon.com/documentation/"> API Reference</a>
 */
public class RefundRequest extends Request implements Serializable  {
        
    //required parameters
    private String amazonCaptureId;
    private String refundReferenceId;
    private String refundAmount;
    private CurrencyCode refundCurrencyCode;    
    
    //optional parameters
    private String sellerRefundNote;
    private String softDescriptor;
    private String mwsAuthToken;   
    private List<ProviderCredit> providerCredit;


    /**
     * 
     * @param captureId The capture identifier that was generated by Amazon in the earlier call to Capture.
     * @param refundReferenceId The identifier for this refund transaction that you specify. 
     *                          This identifier must be unique for all your refund transactions.
     * @param refundAmount The amount to refund.
     */
    public RefundRequest(String captureId, String refundReferenceId, String refundAmount ) {
        super("Refund");
        this.amazonCaptureId = captureId;
        this.refundReferenceId = refundReferenceId;
        this.refundAmount = refundAmount;
    }

    /**
     * 
     * @param currencyCode Three-digit currency code. In ISO 4217 format.
     */
    public RefundRequest setRefundCurrencyCode(CurrencyCode currencyCode) {
        this.refundCurrencyCode = currencyCode;
        return this;
    }


    /**
     * Sets the description for the refund that is displayed in emails to the buyer.
     * @param sellerRefundNote
     */
    public RefundRequest setSellerRefundNote(String sellerRefundNote){
        this.sellerRefundNote = sellerRefundNote;
         return this;
    }

    /**
     * Sets the description to be shown on the buyer's payment instrument statement. 
     * The soft descriptor sent to the payment processor is: “AMZ* <soft descriptor specified here>”.
     * @param softDescriptor
     */
    public RefundRequest setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
        return this;
    }

    /**
     * Sets MWSAuthToken. Applicable for third-party solution providers only.
     * @param mwsAuthToken
     */
    public RefundRequest setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * 
     * @return amazonCaptureId
     */
    public String getAmazonCaptureId() {
        return amazonCaptureId;
    }

    /**
     * 
     * @return refundReferenceId
     */
    public String getRefundReferenceId() {
        return refundReferenceId;
    }

    /**
     * 
     * @return refundAmount
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * 
     * @return refundCurrencyCode
     */
    public CurrencyCode getRefundCurrencyCode() {
        return refundCurrencyCode;
    }

    /**
     * 
     * @return sellerRefundNote
     */
    public String getSellerRefundNote() {
        return sellerRefundNote;
    }

    /**
     * 
     * @return softDescriptor 
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * 
     * @return mwsAuthToken
     */
    public String getMwsAuthToken() {
        return mwsAuthToken;
    }

    /**
    * Applicable for third-party solution providers only. 
    * 
    * @return ProviderCredit associated with Refund operation
    */
    public List<ProviderCredit> getProviderCredit() {
        return providerCredit;
    }
    
    /**
    * Applicable for third-party solution providers only. 
    * 
    * @param ProviderCredit associated with Refund operation
    * 
    */
    public RefundRequest setProviderCredit(List<ProviderCredit> providerCreditList) {
        this.providerCredit = providerCreditList;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RefundRequest{" + "amazonCaptureId=" + amazonCaptureId + ", refundReferenceId=" + refundReferenceId + ", refundAmount=" 
                + refundAmount + ", refundCurrencyCode=" + refundCurrencyCode + ", sellerRefundNote=" + sellerRefundNote + ", softDescriptor=" 
                + softDescriptor + ", mwsAuthToken=" + mwsAuthToken + ", providerCredit=" + providerCredit + '}';
    }
    
}