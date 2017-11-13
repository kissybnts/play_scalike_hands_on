package controllers

import javax.inject.Inject

import play.api.mvc._
import play.api.i18n.{I18nSupport, MessagesApi}

class UserController @Inject()(messagesApi: MessagesApi) extends InjectedController with I18nSupport {
  def list = TODO

  def edit(id: Option[Long]) = TODO

  def create = TODO

  def update = TODO

  def remove(id: Long) = TODO
}
