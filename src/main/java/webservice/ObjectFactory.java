
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://Source/", "Exception");
    private final static QName _AddAuto_QNAME = new QName("http://Source/", "addAuto");
    private final static QName _AddAutoResponse_QNAME = new QName("http://Source/", "addAutoResponse");
    private final static QName _AutoReturn_QNAME = new QName("http://Source/", "autoReturn");
    private final static QName _AutoReturnResponse_QNAME = new QName("http://Source/", "autoReturnResponse");
    private final static QName _ChangeParameters_QNAME = new QName("http://Source/", "changeParameters");
    private final static QName _ChangeParametersResponse_QNAME = new QName("http://Source/", "changeParametersResponse");
    private final static QName _GetList_QNAME = new QName("http://Source/", "getList");
    private final static QName _GetListFromModel_QNAME = new QName("http://Source/", "getListFromModel");
    private final static QName _GetListFromModelResponse_QNAME = new QName("http://Source/", "getListFromModelResponse");
    private final static QName _GetListResponse_QNAME = new QName("http://Source/", "getListResponse");
    private final static QName _GetStatus_QNAME = new QName("http://Source/", "getStatus");
    private final static QName _GetStatusResponse_QNAME = new QName("http://Source/", "getStatusResponse");
    private final static QName _OrderAuto_QNAME = new QName("http://Source/", "orderAuto");
    private final static QName _OrderAutoResponse_QNAME = new QName("http://Source/", "orderAutoResponse");
    private final static QName _SayHello_QNAME = new QName("http://Source/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://Source/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddAuto }
     * 
     */
    public AddAuto createAddAuto() {
        return new AddAuto();
    }

    /**
     * Create an instance of {@link AddAutoResponse }
     * 
     */
    public AddAutoResponse createAddAutoResponse() {
        return new AddAutoResponse();
    }

    /**
     * Create an instance of {@link AutoReturn }
     * 
     */
    public AutoReturn createAutoReturn() {
        return new AutoReturn();
    }

    /**
     * Create an instance of {@link AutoReturnResponse }
     * 
     */
    public AutoReturnResponse createAutoReturnResponse() {
        return new AutoReturnResponse();
    }

    /**
     * Create an instance of {@link ChangeParameters }
     * 
     */
    public ChangeParameters createChangeParameters() {
        return new ChangeParameters();
    }

    /**
     * Create an instance of {@link ChangeParametersResponse }
     * 
     */
    public ChangeParametersResponse createChangeParametersResponse() {
        return new ChangeParametersResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListFromModel }
     * 
     */
    public GetListFromModel createGetListFromModel() {
        return new GetListFromModel();
    }

    /**
     * Create an instance of {@link GetListFromModelResponse }
     * 
     */
    public GetListFromModelResponse createGetListFromModelResponse() {
        return new GetListFromModelResponse();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link OrderAuto }
     * 
     */
    public OrderAuto createOrderAuto() {
        return new OrderAuto();
    }

    /**
     * Create an instance of {@link OrderAutoResponse }
     * 
     */
    public OrderAutoResponse createOrderAutoResponse() {
        return new OrderAutoResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAuto }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "addAuto")
    public JAXBElement<AddAuto> createAddAuto(AddAuto value) {
        return new JAXBElement<AddAuto>(_AddAuto_QNAME, AddAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "addAutoResponse")
    public JAXBElement<AddAutoResponse> createAddAutoResponse(AddAutoResponse value) {
        return new JAXBElement<AddAutoResponse>(_AddAutoResponse_QNAME, AddAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoReturn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoReturn }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "autoReturn")
    public JAXBElement<AutoReturn> createAutoReturn(AutoReturn value) {
        return new JAXBElement<AutoReturn>(_AutoReturn_QNAME, AutoReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoReturnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoReturnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "autoReturnResponse")
    public JAXBElement<AutoReturnResponse> createAutoReturnResponse(AutoReturnResponse value) {
        return new JAXBElement<AutoReturnResponse>(_AutoReturnResponse_QNAME, AutoReturnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "changeParameters")
    public JAXBElement<ChangeParameters> createChangeParameters(ChangeParameters value) {
        return new JAXBElement<ChangeParameters>(_ChangeParameters_QNAME, ChangeParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeParametersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeParametersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "changeParametersResponse")
    public JAXBElement<ChangeParametersResponse> createChangeParametersResponse(ChangeParametersResponse value) {
        return new JAXBElement<ChangeParametersResponse>(_ChangeParametersResponse_QNAME, ChangeParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFromModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFromModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getListFromModel")
    public JAXBElement<GetListFromModel> createGetListFromModel(GetListFromModel value) {
        return new JAXBElement<GetListFromModel>(_GetListFromModel_QNAME, GetListFromModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListFromModelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListFromModelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getListFromModelResponse")
    public JAXBElement<GetListFromModelResponse> createGetListFromModelResponse(GetListFromModelResponse value) {
        return new JAXBElement<GetListFromModelResponse>(_GetListFromModelResponse_QNAME, GetListFromModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAuto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderAuto }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "orderAuto")
    public JAXBElement<OrderAuto> createOrderAuto(OrderAuto value) {
        return new JAXBElement<OrderAuto>(_OrderAuto_QNAME, OrderAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderAutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "orderAutoResponse")
    public JAXBElement<OrderAutoResponse> createOrderAutoResponse(OrderAutoResponse value) {
        return new JAXBElement<OrderAutoResponse>(_OrderAutoResponse_QNAME, OrderAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Source/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
