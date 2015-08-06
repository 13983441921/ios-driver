/*
 * Copyright 2012-2013 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.uiautomation.ios.wkrdp;

import org.json.JSONObject;

import java.util.concurrent.Future;

public interface MessageHandler {

  public void handle(String msg);

  public void stop();

  void addListener(MessageListener listener);

  /**
  * Prepares for an incoming response to a WebDriver command under the given commandId.
  * Returns a future, which will provide a JSONObject as soon as the corresponding response
  * from the simulator or device has been processed.
  *
  * @param commandId for which a response is expected
  * @return A future which will return a JSONObject as soon as an incoming response
  *     to that commandId has been processed
  */
  Future<JSONObject> createMessageFuture(int commandId);

}