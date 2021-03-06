/*
 * [The "BSD licence"]
 * Copyright (c) 2012 Dandelion
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 3. Neither the name of Dandelion nor the names of its contributors 
 * may be used to endorse or promote products derived from this software 
 * without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.github.dandelion.datatables.core.html;

import com.github.dandelion.core.util.StringUtils;



/**
 * Plain old HTML <code>a</code> tag (link).
 * 
 * @author Thibault Duchateau
 * @since 0.7.0
 */
public class HtmlHyperlink extends HtmlTagWithContent {

	/**
	 * Plain old HTML <code>href</code> attribute.
	 */
	private String href;

	/**
	 * Plain old HTML <code>onclick</code> attribute.
	 */
	private String onclick;

	public HtmlHyperlink() {
		this.tag = "a";
	}

	public HtmlHyperlink(String href, String label) {
		this.tag = "a";
		this.href = href;
		addContent(label);
	}

	@Override
	protected StringBuilder getHtmlAttributes() {
		StringBuilder html = super.getHtmlAttributes();
		if(StringUtils.isNotBlank(this.href)){
			html.append(writeAttribute("href", this.href));
		}
		if(StringUtils.isNotBlank(this.onclick)){
			html.append(writeAttribute("onclick", this.onclick));
		}
		return html;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}
}