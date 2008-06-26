/*
 * Copyright 2007 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.client.result;

/**
 * @author srowen@google.com (Sean Owen)
 */
public final class AddressBookParsedResult extends AbstractDoCoMoParsedResult {

  private final String[] names;
  private final String[] phoneNumbers;
  private final String[] emails;
  private final String note;
  private final String address;
  private final String org;
  private final String birthday;
  private final String title;

  public AddressBookParsedResult(String[] names,
                                 String[] phoneNumbers,
                                 String[] emails,
                                 String note,
                                 String address,
                                 String org,
                                 String birthday,
                                 String title) {
    super(ParsedResultType.ADDRESSBOOK);
    this.names = names;
    this.phoneNumbers = phoneNumbers;
    this.emails = emails;
    this.note = note;
    this.address = address;
    this.org = org;
    this.birthday = birthday;
    this.title = title;
  }

  public String[] getNames() {
    return names;
  }

  public String[] getPhoneNumbers() {
    return phoneNumbers;
  }

  public String[] getEmails() {
    return emails;
  }

  public String getNote() {
    return note;
  }

  public String getAddress() {
    return address;
  }

  public String getTitle() {
    return title;
  }

  public String getOrg() {
    return org;
  }

  public String getBirthday() {
    return birthday;
  }

  public String getDisplayResult() {
    StringBuffer result = new StringBuffer();
    maybeAppend(names, result);
    maybeAppend(emails, result);
    maybeAppend(address, result);
    maybeAppend(phoneNumbers, result);
    maybeAppend(note, result);
    maybeAppend(org, result);
    maybeAppend(birthday, result);
    maybeAppend(title, result);
    return result.toString();
  }

}