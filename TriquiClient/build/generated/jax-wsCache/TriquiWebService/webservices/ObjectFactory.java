
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _LeaveRoomResponse_QNAME = new QName("http://webservices/", "leaveRoomResponse");
    private final static QName _CreateRoom_QNAME = new QName("http://webservices/", "createRoom");
    private final static QName _GetRoomParticipants_QNAME = new QName("http://webservices/", "getRoomParticipants");
    private final static QName _HelloResponse_QNAME = new QName("http://webservices/", "helloResponse");
    private final static QName _Logout_QNAME = new QName("http://webservices/", "logout");
    private final static QName _Hello_QNAME = new QName("http://webservices/", "hello");
    private final static QName _GetPlayerInTurn_QNAME = new QName("http://webservices/", "getPlayerInTurn");
    private final static QName _GetGameBoardResponse_QNAME = new QName("http://webservices/", "getGameBoardResponse");
    private final static QName _CreateRoomResponse_QNAME = new QName("http://webservices/", "createRoomResponse");
    private final static QName _LeaveRoom_QNAME = new QName("http://webservices/", "leaveRoom");
    private final static QName _Play_QNAME = new QName("http://webservices/", "play");
    private final static QName _GetGameBoard_QNAME = new QName("http://webservices/", "getGameBoard");
    private final static QName _LoginResponse_QNAME = new QName("http://webservices/", "loginResponse");
    private final static QName _PlayResponse_QNAME = new QName("http://webservices/", "playResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://webservices/", "logoutResponse");
    private final static QName _GetRoomsResponse_QNAME = new QName("http://webservices/", "getRoomsResponse");
    private final static QName _Login_QNAME = new QName("http://webservices/", "login");
    private final static QName _GetPlayersResponse_QNAME = new QName("http://webservices/", "getPlayersResponse");
    private final static QName _GetRoomParticipantsResponse_QNAME = new QName("http://webservices/", "getRoomParticipantsResponse");
    private final static QName _JoinRoom_QNAME = new QName("http://webservices/", "joinRoom");
    private final static QName _PlayAgainResponse_QNAME = new QName("http://webservices/", "playAgainResponse");
    private final static QName _JoinRoomResponse_QNAME = new QName("http://webservices/", "joinRoomResponse");
    private final static QName _PlayAgain_QNAME = new QName("http://webservices/", "playAgain");
    private final static QName _GetPlayerInTurnResponse_QNAME = new QName("http://webservices/", "getPlayerInTurnResponse");
    private final static QName _GetPlayers_QNAME = new QName("http://webservices/", "getPlayers");
    private final static QName _GetRooms_QNAME = new QName("http://webservices/", "getRooms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRooms }
     * 
     */
    public GetRooms createGetRooms() {
        return new GetRooms();
    }

    /**
     * Create an instance of {@link GetPlayers }
     * 
     */
    public GetPlayers createGetPlayers() {
        return new GetPlayers();
    }

    /**
     * Create an instance of {@link GetPlayerInTurnResponse }
     * 
     */
    public GetPlayerInTurnResponse createGetPlayerInTurnResponse() {
        return new GetPlayerInTurnResponse();
    }

    /**
     * Create an instance of {@link PlayAgain }
     * 
     */
    public PlayAgain createPlayAgain() {
        return new PlayAgain();
    }

    /**
     * Create an instance of {@link JoinRoomResponse }
     * 
     */
    public JoinRoomResponse createJoinRoomResponse() {
        return new JoinRoomResponse();
    }

    /**
     * Create an instance of {@link PlayAgainResponse }
     * 
     */
    public PlayAgainResponse createPlayAgainResponse() {
        return new PlayAgainResponse();
    }

    /**
     * Create an instance of {@link JoinRoom }
     * 
     */
    public JoinRoom createJoinRoom() {
        return new JoinRoom();
    }

    /**
     * Create an instance of {@link GetRoomParticipantsResponse }
     * 
     */
    public GetRoomParticipantsResponse createGetRoomParticipantsResponse() {
        return new GetRoomParticipantsResponse();
    }

    /**
     * Create an instance of {@link GetPlayersResponse }
     * 
     */
    public GetPlayersResponse createGetPlayersResponse() {
        return new GetPlayersResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetRoomsResponse }
     * 
     */
    public GetRoomsResponse createGetRoomsResponse() {
        return new GetRoomsResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link PlayResponse }
     * 
     */
    public PlayResponse createPlayResponse() {
        return new PlayResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Play }
     * 
     */
    public Play createPlay() {
        return new Play();
    }

    /**
     * Create an instance of {@link GetGameBoard }
     * 
     */
    public GetGameBoard createGetGameBoard() {
        return new GetGameBoard();
    }

    /**
     * Create an instance of {@link LeaveRoom }
     * 
     */
    public LeaveRoom createLeaveRoom() {
        return new LeaveRoom();
    }

    /**
     * Create an instance of {@link GetGameBoardResponse }
     * 
     */
    public GetGameBoardResponse createGetGameBoardResponse() {
        return new GetGameBoardResponse();
    }

    /**
     * Create an instance of {@link CreateRoomResponse }
     * 
     */
    public CreateRoomResponse createCreateRoomResponse() {
        return new CreateRoomResponse();
    }

    /**
     * Create an instance of {@link GetPlayerInTurn }
     * 
     */
    public GetPlayerInTurn createGetPlayerInTurn() {
        return new GetPlayerInTurn();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetRoomParticipants }
     * 
     */
    public GetRoomParticipants createGetRoomParticipants() {
        return new GetRoomParticipants();
    }

    /**
     * Create an instance of {@link CreateRoom }
     * 
     */
    public CreateRoom createCreateRoom() {
        return new CreateRoom();
    }

    /**
     * Create an instance of {@link LeaveRoomResponse }
     * 
     */
    public LeaveRoomResponse createLeaveRoomResponse() {
        return new LeaveRoomResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "leaveRoomResponse")
    public JAXBElement<LeaveRoomResponse> createLeaveRoomResponse(LeaveRoomResponse value) {
        return new JAXBElement<LeaveRoomResponse>(_LeaveRoomResponse_QNAME, LeaveRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createRoom")
    public JAXBElement<CreateRoom> createCreateRoom(CreateRoom value) {
        return new JAXBElement<CreateRoom>(_CreateRoom_QNAME, CreateRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomParticipants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRoomParticipants")
    public JAXBElement<GetRoomParticipants> createGetRoomParticipants(GetRoomParticipants value) {
        return new JAXBElement<GetRoomParticipants>(_GetRoomParticipants_QNAME, GetRoomParticipants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerInTurn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getPlayerInTurn")
    public JAXBElement<GetPlayerInTurn> createGetPlayerInTurn(GetPlayerInTurn value) {
        return new JAXBElement<GetPlayerInTurn>(_GetPlayerInTurn_QNAME, GetPlayerInTurn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getGameBoardResponse")
    public JAXBElement<GetGameBoardResponse> createGetGameBoardResponse(GetGameBoardResponse value) {
        return new JAXBElement<GetGameBoardResponse>(_GetGameBoardResponse_QNAME, GetGameBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "createRoomResponse")
    public JAXBElement<CreateRoomResponse> createCreateRoomResponse(CreateRoomResponse value) {
        return new JAXBElement<CreateRoomResponse>(_CreateRoomResponse_QNAME, CreateRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "leaveRoom")
    public JAXBElement<LeaveRoom> createLeaveRoom(LeaveRoom value) {
        return new JAXBElement<LeaveRoom>(_LeaveRoom_QNAME, LeaveRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Play }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "play")
    public JAXBElement<Play> createPlay(Play value) {
        return new JAXBElement<Play>(_Play_QNAME, Play.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getGameBoard")
    public JAXBElement<GetGameBoard> createGetGameBoard(GetGameBoard value) {
        return new JAXBElement<GetGameBoard>(_GetGameBoard_QNAME, GetGameBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "playResponse")
    public JAXBElement<PlayResponse> createPlayResponse(PlayResponse value) {
        return new JAXBElement<PlayResponse>(_PlayResponse_QNAME, PlayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRoomsResponse")
    public JAXBElement<GetRoomsResponse> createGetRoomsResponse(GetRoomsResponse value) {
        return new JAXBElement<GetRoomsResponse>(_GetRoomsResponse_QNAME, GetRoomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getPlayersResponse")
    public JAXBElement<GetPlayersResponse> createGetPlayersResponse(GetPlayersResponse value) {
        return new JAXBElement<GetPlayersResponse>(_GetPlayersResponse_QNAME, GetPlayersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomParticipantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRoomParticipantsResponse")
    public JAXBElement<GetRoomParticipantsResponse> createGetRoomParticipantsResponse(GetRoomParticipantsResponse value) {
        return new JAXBElement<GetRoomParticipantsResponse>(_GetRoomParticipantsResponse_QNAME, GetRoomParticipantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "joinRoom")
    public JAXBElement<JoinRoom> createJoinRoom(JoinRoom value) {
        return new JAXBElement<JoinRoom>(_JoinRoom_QNAME, JoinRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayAgainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "playAgainResponse")
    public JAXBElement<PlayAgainResponse> createPlayAgainResponse(PlayAgainResponse value) {
        return new JAXBElement<PlayAgainResponse>(_PlayAgainResponse_QNAME, PlayAgainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "joinRoomResponse")
    public JAXBElement<JoinRoomResponse> createJoinRoomResponse(JoinRoomResponse value) {
        return new JAXBElement<JoinRoomResponse>(_JoinRoomResponse_QNAME, JoinRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayAgain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "playAgain")
    public JAXBElement<PlayAgain> createPlayAgain(PlayAgain value) {
        return new JAXBElement<PlayAgain>(_PlayAgain_QNAME, PlayAgain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayerInTurnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getPlayerInTurnResponse")
    public JAXBElement<GetPlayerInTurnResponse> createGetPlayerInTurnResponse(GetPlayerInTurnResponse value) {
        return new JAXBElement<GetPlayerInTurnResponse>(_GetPlayerInTurnResponse_QNAME, GetPlayerInTurnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getPlayers")
    public JAXBElement<GetPlayers> createGetPlayers(GetPlayers value) {
        return new JAXBElement<GetPlayers>(_GetPlayers_QNAME, GetPlayers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "getRooms")
    public JAXBElement<GetRooms> createGetRooms(GetRooms value) {
        return new JAXBElement<GetRooms>(_GetRooms_QNAME, GetRooms.class, null, value);
    }

}
