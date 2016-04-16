/*
 * Copyright 2014-2015 the original author or authors.
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
package io.interface21.anthropoda.thymeleaf;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * A AuthenticationController.
 *
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 * @version 1.0
 * @since 0.1
 */
@Controller
public class AuthenticationController {

    public static final String ROOT_ENTRY = "/user";

    @RequestMapping(ROOT_ENTRY)
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping("/login")
    public String login() {
        return "public/auth/login";
    }
}
