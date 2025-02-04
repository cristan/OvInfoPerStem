package nl.openov.ovinfoperstem.proto// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: mainService.proto
//
import com.connectrpc.Headers
import com.connectrpc.ResponseMessage
import com.connectrpc.ServerOnlyStreamInterface
import com.google.protobuf.Empty

public interface TravelChatServiceClientInterface {
  public suspend fun sendInput(request: UserInputOuterClass.UserInput, headers: Headers = emptyMap()): ResponseMessage<UserInputOuterClass.UserInputResponse>

  public suspend fun getFeedback(headers: Headers = emptyMap()): ServerOnlyStreamInterface<Empty, FeedbackOuterClass.Feedback>
}
